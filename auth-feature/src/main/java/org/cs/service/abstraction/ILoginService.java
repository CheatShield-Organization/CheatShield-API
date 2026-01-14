package org.cs.service.abstraction;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserActiveSessionDTO;

public interface ILoginService {

    public UserActiveSessionDTO isUserLoggedIn(String emailAddress);

    public void login(String emailAddress, String password);

}
