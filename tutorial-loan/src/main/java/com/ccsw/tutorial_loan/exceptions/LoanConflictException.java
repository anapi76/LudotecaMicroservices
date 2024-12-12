package com.ccsw.tutorial_loan.exceptions;

public class LoanConflictException extends RuntimeException {
    public LoanConflictException(String message) {
        super(message);
    }
}
