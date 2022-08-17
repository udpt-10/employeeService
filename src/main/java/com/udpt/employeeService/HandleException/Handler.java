package com.udpt.employeeService.HandleException;

import com.udpt.employeeService.Constant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Handler {

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Error> notFoundException(NotFoundException notFoundException) {
        Error error = new Error(Constant.NOT_FOUNT_EXCEPTION, notFoundException.getMessage());
        return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = DuplicateException.class)
    public ResponseEntity<Error> duplicateException(DuplicateException duplicateException) {
        Error error = new Error(Constant.DUPLICATE_EXCEPTION, duplicateException.getMessage());
        return new ResponseEntity<Error>(error, HttpStatus.BAD_REQUEST);
    }
}