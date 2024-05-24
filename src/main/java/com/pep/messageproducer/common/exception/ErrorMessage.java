package com.pep.messageproducer.common.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
public class ErrorMessage {

    @JsonIgnore
    private final HttpStatus status;
    private final Date timestamp;
    private final String message;


    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }
}
