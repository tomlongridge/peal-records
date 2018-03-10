package com.tomlongridge.pealrecords.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tomlongridge.pealrecords.service.exceptions.EntityNotFoundException;
import com.tomlongridge.pealrecords.web.api.ApiError;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ApiError> handleEntityNotFoundException(final EntityNotFoundException e) {
        return buildResponseEntity(new ApiError(HttpStatus.NOT_FOUND, e.getMessage()));
    }
    
    private ResponseEntity<ApiError> buildResponseEntity(final ApiError error) {
        return new ResponseEntity<ApiError>(error, error.getStatus());
    }
    
}
