package com.lsmri.welding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsmri.welding.entity.User;
import com.lsmri.welding.mapper.UserMapper;
import com.lsmri.welding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<BaseMapper<User>, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String username) {
        // TODO: 测试null会不会空指针异常
        return userMapper.selectOne(new QueryWrapper<User>().eq("username", username));
    }
}
