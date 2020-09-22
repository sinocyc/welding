package com.lsmri.welding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lsmri.welding.entity.User;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    User findByName(String username);

}
