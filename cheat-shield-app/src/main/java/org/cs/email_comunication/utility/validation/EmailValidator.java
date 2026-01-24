package org.cs.email_comunication.utility.validation;

import org.cs.email_comunication.utility.Email;

public abstract class EmailFilterValidator {

    protected EmailFilterValidator nextValidator;

    public void setValidator(EmailFilterValidator nextValidator){
        this.nextValidator = nextValidator;
    }

    public abstract boolean isValid(Email email);
}
