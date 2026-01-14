package org.cs.repositories.abstraction;

import org.cs.dto.request.CreateUserDTO;

public interface IRegisterRepository {
    /// Creates new user account.
    public void createAccount(CreateUserDTO user);
}
