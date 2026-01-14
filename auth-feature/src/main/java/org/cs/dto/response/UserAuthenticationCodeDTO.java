package org.cs.dto.response;

public class UserAuthenticationCodeDTO {

    public String username;

    public int authCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAuthCode() {
        return authCode;
    }

    public void setAuthCode(int authCode) {
        this.authCode = authCode;
    }

}
