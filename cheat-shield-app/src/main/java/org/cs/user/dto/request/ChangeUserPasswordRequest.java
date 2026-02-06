package org.cs.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ChangeUserPasswordRequest(
        @NotBlank(message = "Email is required!")
        @Email(message = "Invalid email format!")
        String emailAddress,

        @NotBlank(message = "New password is required!")
        @Size(min = 5,message = "The password must be at least 5 characters!")
        String newPassword
) {
}
