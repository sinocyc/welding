package com.lsmri.welding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lsmri.welding.entity.Permission;
import com.lsmri.welding.entity.User;
import com.lsmri.welding.mapper.UserMapper;
import com.lsmri.welding.service.PermissionService;
import com.lsmri.welding.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在。");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        List<Permission> userPermissions = permissionService.getUserPermissions(user.getId());
        userPermissions.forEach(permission -> authorities.add(new SimpleGrantedAuthority(permission.getName())));
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), true, true, true, true, authorities);
        return userDetails;
    }
}
