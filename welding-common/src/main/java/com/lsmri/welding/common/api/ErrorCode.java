package com.lsmri.welding.common.api;

/**
 * @author Cui Yicheng
 * @since 2020/9/29
 */
public interface ErrorCode {

    /**
     * 获取错误码
     *
     * @return 错误码
     */
    int getCode();

    /**
     * 获取错误提示
     *
     * @return 错误提示
     */
    String getMessage();

}
