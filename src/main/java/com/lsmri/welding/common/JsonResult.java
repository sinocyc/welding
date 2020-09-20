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
public class JsonResult<T> implements Serializable {

    private Integer code;
    private String msg;
    private Integer count;
    private T data;

    public static final Integer SUCCESS_CODE = 0;
    public static final Integer FAIL_CODE = 1;

    public static <T> JsonResult<T> success(String msg, Integer count, T data) {
        return new JsonResult<>(SUCCESS_CODE, msg, count, data);
    }

    public static <T> JsonResult<T> success(String msg, T data) {
        return new JsonResult<>(SUCCESS_CODE, msg, 0, data);
    }

    public static <T> JsonResult<T> success(String msg) {
        return JsonResult.success(msg, 0, null);
    }

    public static <T> JsonResult<T> success() {
        return JsonResult.success("success");
    }

    public static <T> JsonResult<T> fail(String msg, Integer count, T data) {
        return new JsonResult<>(FAIL_CODE, msg, count, data);
    }

    public static <T> JsonResult<T> fail(String msg) {
        return JsonResult.fail(msg, 0, null);
    }

    public static <T> JsonResult<T> fail() {
        return JsonResult.fail("fail");
    }

}
