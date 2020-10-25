package com.lsmri.welding.portal.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Cui Yicheng
 * @date 2020-10-25
 */
@Data
public class AddUserQuery {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotNull
    private Long roleId;

}
