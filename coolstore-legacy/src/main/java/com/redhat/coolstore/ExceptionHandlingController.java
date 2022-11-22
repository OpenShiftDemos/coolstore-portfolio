package com.redhat.coolstore;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlingController {

    private static final Logger log = Logger.getLogger(ExceptionHandlingController.class.getName());

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = NOT_FOUND, reason = "Resource not found")
    public void resourceNotFound(final ResourceNotFoundException e) {

        log.warning("Resource not found");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = INTERNAL_SERVER_ERROR, reason = "Internal server error")
    public void resourceNotFound(final Exception e) {

        log.severe("Internal server error: " + e.getMessage());
        e.printStackTrace();
    }
}
