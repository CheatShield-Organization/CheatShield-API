package org.cs.exception.message;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ValidationMessageResponse(

        @Size(min=3, message="The HTTP code produces 3 digit code")
        @NotNull(message = "The HTTP code should not be empty")
        int httpCode,

        @NotNull
        @NotBlank
        String response



) {
}
