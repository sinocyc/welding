package com.lsmri.welding.portal.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-10-24
 */
@Data
public class UserInfoDTO {

    private String username;

    private List<String> authorities;

}
