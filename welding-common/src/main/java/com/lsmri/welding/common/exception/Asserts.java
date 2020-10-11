package com.lsmri.welding.common.exception;


import com.lsmri.welding.common.api.ErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 *
 * @author Cui Yicheng
 * @since 2020/10/10
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(ErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

}
