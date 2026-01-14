package org.cs.service.abstraction;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserAuthenticationCodeDTO;

public interface IAuthenticationService {

    /// Sending authentication code to the client
    public void sendAuthenticationCodeEmail(UserCredentialDTO userCredential);

    /// Checking the authentication code with the sent one.
    public boolean checkAuthenticationCodeEmail(UserAuthenticationCodeDTO authCode);

}
