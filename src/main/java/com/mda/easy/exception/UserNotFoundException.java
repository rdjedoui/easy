package com.mda.easy.exception;

public class UserNotFoundException extends Throwable {
    public UserNotFoundException(String email) {
        super(email);
    }
}
