package org.cs.email_comunication.validation.handler;

import org.cs.payload.ValidationPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailAuthenticationException;
import org.springframework.mail.MailSendException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmailExceptionHandler {

    @ExceptionHandler({MailSendException.class})
    public ResponseEntity<ValidationPayload> handleEmailErrors(MailSendException exception){

        var statusCode = HttpStatus.BAD_REQUEST;


        ValidationPayload validationPayload = ValidationPayload.builder().
                httpStatus(statusCode).
                response("Invalid email configuration: "+exception.getMessage()).
                build();

        return new ResponseEntity<>(validationPayload, statusCode);

    }

    @ExceptionHandler({MailAuthenticationException.class})
    public ResponseEntity<ValidationPayload> handleInvalidCredentials(){

        var statusCode = HttpStatus.INTERNAL_SERVER_ERROR;


        ValidationPayload validationPayload = ValidationPayload.builder().
                httpStatus(statusCode).
                response("Invalid email credentials for the server!").
                build();

        return new ResponseEntity<>(validationPayload, statusCode);
    }

}
