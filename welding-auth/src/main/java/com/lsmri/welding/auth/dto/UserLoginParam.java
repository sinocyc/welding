package com.lsmri.welding.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * @author Cui Yicheng
 * @since 2020/10/10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserLoginParam {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

}
