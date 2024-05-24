package com.pep.messageproducer.common.exception;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ApiException extends RuntimeException {

    private final String message;
    private final HttpStatus status;

}
