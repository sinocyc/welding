package com.lsmri.welding.portal.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Cui Yicheng
 * @date 2020-10-25
 */
@Data
public class ChangePasswordQuery {

    @NotBlank
    private String username;

    @NotBlank
    private String oldPassword;

    @NotBlank
    private String newPassword;

}
