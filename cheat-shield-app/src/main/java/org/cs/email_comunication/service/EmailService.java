package org.cs.email_comunication.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.cs.email_comunication.service.abstraction.IEmailService;
import org.cs.email_comunication.configuration.EmailContentStrategy;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class EmailService implements IEmailService {

    private JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    @Override
    public void sendMessage(EmailContentStrategy emailContent) throws MessagingException {

        mailSender.send(createMimeMessage(emailContent));

    }

    private MimeMessage createMimeMessage(EmailContentStrategy emailContent) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();

        emailContent.MimeMessageConfiguration(message);

        return message;
    }



}
