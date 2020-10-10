package com.lsmri.welding.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Cui Yicheng
 * @date 2020-09-03
 */
@Data
@AllArgsConstructor
public class CommonResult<T> implements Serializable {

    private Integer code;
    private String msg;
    private Integer count;
    private T data;

    public static final Integer SUCCESS_CODE = 0;
    public static final Integer FAIL_CODE = 1;

    public static <T> CommonResult<T> success(String msg, Integer count, T data) {
        return new CommonResult<>(SUCCESS_CODE, msg, count, data);
    }

    public static <T> CommonResult<T> success(String msg, T data) {
        return new CommonResult<>(SUCCESS_CODE, msg, 0, data);
    }

    public static <T> CommonResult<T> success(String msg) {
        return CommonResult.success(msg, 0, null);
    }

    public static <T> CommonResult<T> success() {
        return CommonResult.success("success");
    }

    public static <T> CommonResult<T> fail(String msg, Integer count, T data) {
        return new CommonResult<>(FAIL_CODE, msg, count, data);
    }

    public static <T> CommonResult<T> fail(String msg) {
        return CommonResult.fail(msg, 0, null);
    }

    public static <T> CommonResult<T> fail() {
        return CommonResult.fail("fail");
    }

}
