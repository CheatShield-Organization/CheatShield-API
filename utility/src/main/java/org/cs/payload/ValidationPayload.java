package org.cs.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ValidationMessage(

        @NotNull(message = "The HTTP code should not be empty!")
        HttpStatus httpCode,

        @NotNull(message = "The date time should be represented!")
        LocalDateTime date,

        @NotNull(message = "The HTTP response message should not be null!")
        @NotBlank(message = "The HTTP response message should not be blank!")
        String response



) {
}
