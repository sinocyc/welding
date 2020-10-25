package com.lsmri.welding.portal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lsmri.welding.auth.util.JwtTokenUtil;
import com.lsmri.welding.common.exception.Asserts;
import com.lsmri.welding.mapper.UserMapper;
import com.lsmri.welding.mapper.UserRoleRelationMapper;
import com.lsmri.welding.model.*;
import com.lsmri.welding.portal.dao.UserDao;
import com.lsmri.welding.portal.dto.AddUserQuery;
import com.lsmri.welding.portal.dto.UserRoleDTO;
import com.lsmri.welding.portal.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 用户服务实现类
 *
 * @author Cui Yicheng
 * @date 2020-09-20
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                Asserts.fail("密码不正确");
            }
            if (!userDetails.isEnabled()) {
                Asserts.fail("账号已被禁用");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            log.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDOExample userExample = new UserDOExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<UserDO> userList = userMapper.selectByExample(userExample);
        if (userList.isEmpty()) {
            throw new UsernameNotFoundException("用户名不存在。");
        }
        UserDO user = userList.get(0);
        List<GrantedAuthority> authorities = new ArrayList<>();
        List<PermissionDO> permissionList = userDao.listPermissions(user.getId());
        permissionList.forEach(permission -> authorities.add(new SimpleGrantedAuthority(permission.getName())));
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }

    @Override
    public List<UserRoleDTO> listUserWithRoles(Integer pageNum, Integer pageSize) {
        // 先分页查询用户
        PageHelper.startPage(pageNum, pageSize);
        List<UserDO> userList = userMapper.selectByExample(new UserDOExample());
        PageInfo<UserDO> pageInfo = new PageInfo<>(userList);


        Map<Long, UserRoleDTO> userWithRolesMap = userDao.listUserWithRoles(userList.stream().map(UserDO::getId).collect(Collectors.toList()));
        List<UserRoleDTO> userWithRolesList = userList.stream().map(u -> {
            UserRoleDTO userRoleDTO = userWithRolesMap.get(u.getId());
            // 用户没有角色时，map 中则没有
            if (userRoleDTO == null) {
                userRoleDTO = new UserRoleDTO();
                userRoleDTO.setId(u.getId());
            }
            userRoleDTO.setUsername(u.getUsername());
            userRoleDTO.setStatus(u.getStatus());
            return userRoleDTO;
        }).collect(Collectors.toList());

        Page<UserRoleDTO> userPage = new Page<>();
        userPage.setTotal(pageInfo.getTotal());
        userPage.setPages(pageInfo.getPages());
        userPage.setPageNum(pageNum);
        userPage.setPageSize(pageSize);
        userPage.addAll(userWithRolesList);
        return userPage;
    }

    @Override
    public int save(AddUserQuery addUserQuery) {
        UserDO userDO = new UserDO();
        userDO.setUsername(addUserQuery.getUsername());
        userDO.setPassword(passwordEncoder.encode(addUserQuery.getPassword()));
        // 默认用户状态为1，表示正常
        userDO.setStatus(1);
        int insertNum = userMapper.insert(userDO);
        if (insertNum > 0 && userDO.getId() != null) {
            UserRoleRelationDO userRoleRelation = new UserRoleRelationDO();
            userRoleRelation.setUserId(userDO.getId());
            userRoleRelation.setRoleId(addUserQuery.getRoleId());
            userRoleRelationMapper.insert(userRoleRelation);
        }
        return insertNum;
    }

    @Override
    public boolean usernameExist(String username) {
        UserDOExample example = new UserDOExample();
        UserDOExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        long count = userMapper.countByExample(example);
        return count > 0;
    }

    @Override
    public boolean validatePassword(String username, String password) {
        UserDOExample example = new UserDOExample();
        UserDOExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserDO> userList = userMapper.selectByExample(example);
        String encodedPassword = "";
        if (userList.size() > 0) {
            encodedPassword = userList.get(0).getPassword();
        }
        return passwordEncoder.matches(password, encodedPassword);
    }

    @Override
    public boolean changePassword(String username, String password) {
        UserDO user = new UserDO();
        user.setPassword(passwordEncoder.encode(password));

        UserDOExample example = new UserDOExample();
        UserDOExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        int updateNum = userMapper.updateByExampleSelective(user, example);
        return updateNum > 0;
    }

    @Override
    public boolean delete(String username) {
        UserDOExample example = new UserDOExample();
        UserDOExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserDO> userList = userMapper.selectByExample(example);
        if (userList.size() < 1) {
            return false;
        }
        Long userId = userList.get(0).getId();
        int deleteNum = userMapper.deleteByExample(example);
        if (deleteNum > 0) {
            UserRoleRelationDOExample userRoleExample = new UserRoleRelationDOExample();
            UserRoleRelationDOExample.Criteria userRoleCriteria = userRoleExample.createCriteria();
            userRoleCriteria.andUserIdEqualTo(userId);
            userRoleRelationMapper.deleteByExample(userRoleExample);
        }
        return deleteNum > 0;
    }
}
