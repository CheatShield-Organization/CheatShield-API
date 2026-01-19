package org.cs.service.abstraction;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserActiveSessionDTO;

public interface ILoginService {

    public UserActiveSessionDTO sessionStatus(String emailAddress);

    public UserCredentialDTO login(String emailAddress, String password);

}
