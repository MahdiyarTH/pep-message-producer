package com.pep.messageproducer.config;

import com.pep.messageproducer.common.exception.ApiException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus responseStatus = HttpStatus.valueOf(response.status());

        if (responseStatus.is5xxServerError()) {
            return ApiException.builder().message("Internal server error").status(responseStatus).build();
        } else if (responseStatus.is4xxClientError()) {
            return ApiException.builder().message("Client error").status(responseStatus).build();
        } else {
            return new Exception("Generic exception");
        }
    }
}
