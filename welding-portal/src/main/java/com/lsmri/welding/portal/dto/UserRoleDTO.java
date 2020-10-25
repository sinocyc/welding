package com.lsmri.welding.portal.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-10-25
 */
@Data
public class UserRoleDTO {

    private Long id;

    private String username;

    private Integer status;

    private List<String> roles;

}
