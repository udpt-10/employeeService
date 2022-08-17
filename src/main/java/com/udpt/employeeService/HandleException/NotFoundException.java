package com.udpt.employeeService.HandleException;

public class NotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public NotFoundException(String message) {
        super("Not found exception: " + message);
    }
}