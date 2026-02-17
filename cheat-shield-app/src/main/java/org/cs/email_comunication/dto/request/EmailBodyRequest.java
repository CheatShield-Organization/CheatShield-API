package org.cs.email_comunication.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmailBodyRequest(

        @NotNull(message = "The title should not be empty!")
        @NotBlank(message = "The title should not be blank!")
        String title,
        @NotNull(message = "The context should not be empty!")
        @NotBlank(message = "The context should not be blank!")
        String context,
        @Email(message = "Structurally this email is not written right!")
        String receiverAddress

)
{ }
