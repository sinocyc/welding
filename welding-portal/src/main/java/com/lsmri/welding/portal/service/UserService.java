package com.lsmri.welding.portal.service;

import com.lsmri.welding.portal.dto.AddUserQuery;
import com.lsmri.welding.portal.dto.UserRoleDTO;

import java.util.List;

/**
 * 用户服务接口
 *
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

    /**
     * 分页查询用户信息
     *
     * @param pageNum  页数
     * @param pageSize 每页条数
     * @return 用户信息列表
     */
    List<UserRoleDTO> listUserWithRoles(Integer pageNum, Integer pageSize);

    /**
     * 新建用户
     *
     * @param addUserQuery 用户信息
     * @return 新建数量
     */
    int save(AddUserQuery addUserQuery);

    /**
     * 判断用户名是否存在
     *
     * @param username 用户名
     * @return true 存在，false 不存在
     */
    boolean usernameExist(String username);

    /**
     * 验证用户的密码
     *
     * @param username 用户名
     * @param password 密码
     * @return true 正确，false 错误
     */
    boolean validatePassword(String username, String password);

    /**
     * 修改密码
     *
     * @param username 用户名
     * @param password 密码
     * @return true 修改成功，false 修改失败
     */
    boolean changePassword(String username, String password);

    /**
     * 根据用户名删除用户
     *
     * @param username 用户名
     * @return true 删除成功，false 删除失败
     */
    boolean delete(String username);

}
