package org.cs.repositories.abstraction;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserActiveSessionDTO;

public interface ILoginRepository {

    public UserActiveSessionDTO isUserLoggedIn(String emailAddress);

    public void login(String emailAddress, String password);

}
