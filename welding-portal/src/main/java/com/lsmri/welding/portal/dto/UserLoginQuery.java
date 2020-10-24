package com.lsmri.welding.portal.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author Cui Yicheng
 * @since 2020/10/10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserLoginQuery {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
