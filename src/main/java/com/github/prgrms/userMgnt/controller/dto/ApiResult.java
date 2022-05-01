package com.github.prgrms.userMgnt.controller.dto;

public class ApiResult<T> {
    private final T data;
    private final String error;

    public ApiResult(T data, String error) {
        this.data = data;
        this.error = error;
    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(data, null);
    }
    public static <T> ApiResult<T> failed(Throwable throwable) {
        return new ApiResult<>(null, throwable.getMessage());
    }

    public T getData() {
        return data;
    }

    public String getError() {
        return error;
    }
}
