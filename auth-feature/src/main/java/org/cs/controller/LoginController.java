package org.cs.controller;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.service.abstraction.IAuthenticationService;
import org.cs.service.abstraction.ILoginService;

public class LoginController {

    private ILoginService loginService;

    private IAuthenticationService authenticationService;

    public void loginToApp(UserCredentialDTO userCredential){

        if(isUserSessionActive(userCredential.emailAddress)){
            loginService.login(userCredential.getEmailAddress(), userCredential.getPassword());
            return;
        }


    }

    public boolean isUserSessionActive(String emailAddress){

        return loginService.isUserLoggedIn(emailAddress).isSessionActive;

    }


}
