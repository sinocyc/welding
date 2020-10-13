package com.lsmri.welding.portal.service;

/**
 * @author Cui Yicheng
 * @date 2020-10-11
 */
public interface UserService {

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

}
