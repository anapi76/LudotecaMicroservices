package com.ccsw.tutorial_customer.exceptions;

public class NameAlreadyExistsException extends RuntimeException {

    public NameAlreadyExistsException(String message) {
        super(message);
    }

}
