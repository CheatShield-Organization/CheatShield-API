package org.cs.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.cs.entity.enums.UserRole;

public record CreateUserDTO(

        @NotBlank(message = "Username is required!")
        String username,

        @NotBlank(message = "Email is required!")
        @Email(message = "Invalid email format!")
        String emailAddress,

        @NotBlank(message = "Password is required!")
        @Size(min = 5,message = "The password must be at least 5 characters!")
        String password,

        @NotNull(message = "Role is required")
        UserRole role
) {
}
