package com.example.handelException;

// custom Exception-handle type
// 自定义异常类型 -2  query too much

public class QueryTooFastException extends RuntimeException {
    private String message;

    public QueryTooFastException() {
        super();
    }

    public QueryTooFastException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}