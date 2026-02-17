package org.cs.email_comunication.service.abstraction;

import jakarta.mail.MessagingException;
import org.cs.email_comunication.configuration.EmailContentStrategy;

public interface IEmailService {

    public void sendMessage(EmailContentStrategy emailContent) throws MessagingException;

}
