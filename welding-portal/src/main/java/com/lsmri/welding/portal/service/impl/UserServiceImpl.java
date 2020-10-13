package com.lsmri.welding.portal.service.impl;

import com.lsmri.welding.auth.util.JwtTokenUtil;
import com.lsmri.welding.common.exception.Asserts;
import com.lsmri.welding.mapper.UserMapper;
import com.lsmri.welding.model.PermissionDO;
import com.lsmri.welding.model.UserDO;
import com.lsmri.welding.model.UserDOExample;
import com.lsmri.welding.portal.dao.UserDao;
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

/**
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
}
