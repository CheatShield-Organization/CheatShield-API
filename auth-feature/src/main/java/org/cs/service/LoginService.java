package org.cs.service;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserActiveSessionDTO;
import org.cs.repositories.LoginRepository;
import org.cs.service.abstraction.ILoginService;

public class LoginService implements ILoginService {

    private LoginRepository loginRepository;

    @Override
    public UserActiveSessionDTO isUserLoggedIn(String emailAddress) {
        return loginRepository.isUserLoggedIn(emailAddress);
    }

    @Override
    public void login(String emailAddress, String password) {
        loginRepository.login(emailAddress, password);
    }

}
