package org.cs.user.dto.response;

import org.cs.entity.enums.UserRole;

public record RetrieveUserDTO(String username, String emailAddress, UserRole role) {
}
