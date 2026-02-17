package org.cs.email_comunication.configuration;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

@FunctionalInterface
public interface EmailContentStrategy {

    void MimeMessageConfiguration(MimeMessage message) throws MessagingException;
}
