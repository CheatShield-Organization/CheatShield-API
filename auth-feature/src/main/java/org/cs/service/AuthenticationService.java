package org.cs.service;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserAuthenticationCodeDTO;
import org.cs.service.abstraction.IAuthenticationService;

/// Service that authentication the users for permissions.
public class AuthenticationService implements IAuthenticationService {

    @Override
    public void sendAuthenticationCodeEmail(UserCredentialDTO userCredential) {

    }

    @Override
    public boolean checkAuthenticationCodeEmail(UserAuthenticationCodeDTO authCode) {

    }
}
