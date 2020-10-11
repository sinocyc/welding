package com.lsmri.welding.common.exception;

import com.lsmri.welding.common.api.ErrorCode;

/**
 * 自定义API异常
 *
 * @author Cui Yicheng
 * @since 2020/10/10
 */
public class ApiException extends RuntimeException {

    private ErrorCode errorCode;

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
