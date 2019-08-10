package com.stackroute.exceptions;

public class UserAlreadyExistException extends Exception {

    String message;

    public UserAlreadyExistException() {
    }

    public UserAlreadyExistException(String message) {
        super(message);
        this.message = message;
    }
}
