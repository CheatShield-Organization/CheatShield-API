package org.cs.payload.abstraction;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

public class SuccessPayload extends GeneralPayload {
    @Override
    public void setHttpCode(HttpStatus httpCode) throws HttpServerErrorException {

    }
}
