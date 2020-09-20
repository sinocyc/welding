package com.lsmri.welding.entity;

import lombok.Data;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer status;

}
