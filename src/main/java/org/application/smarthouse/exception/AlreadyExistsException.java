package org.application.smarthouse.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AlreadyExistsException extends RuntimeException {

    private final HttpStatus status;

    public AlreadyExistsException(String message) {
        super(message);
        this.status = HttpStatus.CONFLICT;
    }
}