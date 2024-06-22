package com.bank.loan.exception;

import com.bank.loan.utils.MessagesUtils;

public class BadRequestException extends  RuntimeException{
    private final String message;

    public BadRequestException(String errorCode, Object... var2) {
        this.message = MessagesUtils.getMessage(errorCode, var2);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
