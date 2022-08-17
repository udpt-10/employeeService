package com.udpt.employeeService.HandleException;

public class DuplicateException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DuplicateException(String message) {
        super("Duplicate exception: " + message);
    }
}