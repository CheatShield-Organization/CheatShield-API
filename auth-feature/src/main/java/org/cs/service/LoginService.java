package org.cs.service;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserActiveSessionDTO;
import org.cs.repositories.LoginRepository;
import org.cs.service.abstraction.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    private LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    @Override
    public UserActiveSessionDTO sessionStatus(String emailAddress) {
        return loginRepository.sessionStatus(emailAddress);
    }

    @Override
    public UserCredentialDTO login(String emailAddress, String password) {
        return loginRepository.login(emailAddress,password);
    }

}
