package org.cs.controller;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.dto.response.UserActiveSessionDTO;
import org.cs.service.abstraction.IAuthenticationService;
import org.cs.service.abstraction.ILoginService;
import org.cs.service.abstraction.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private ILoginService loginService;

    private IRegisterService registerService;

    private IAuthenticationService authenticationService;

    public AuthController(ILoginService loginService, IRegisterService registerService, IAuthenticationService authenticationService) {
        this.loginService = loginService;
        this.registerService = registerService;
        this.authenticationService = authenticationService;
    }



    @PostMapping("/login")
    public void login(@RequestBody UserCredentialDTO userCredential){
        loginService.login(userCredential.getEmailAddress(), userCredential.getPassword());
    }

    @GetMapping("/session-status")
    public UserActiveSessionDTO UserSessionStatus(@RequestParam String emailAddress){
        return loginService.sessionStatus(emailAddress);
    }


}
