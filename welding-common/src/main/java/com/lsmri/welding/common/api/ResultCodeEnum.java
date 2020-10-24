package com.lsmri.welding.common.api;

/**
 * @author Cui Yicheng
 * @since 2020/9/29
 */
public enum ResultCodeEnum implements ErrorCode {

    /**
     * 操作成功
     */
    SUCCESS(1, "操作成功"),
    /**
     * 操作失败
     */
    FAILED(2, "操作失败"),
    /**
     * 参数检验失败
     */
    VALIDATE_FAILED(3, "参数检验失败"),
    /**
     * 暂未登录或token已经过期
     */
    UNAUTHORIZED(4, "暂未登录或token已经过期"),
    /**
     * 没有相关权限
     */
    FORBIDDEN(5, "没有相关权限");

    private int code;
    private String message;

    private ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
