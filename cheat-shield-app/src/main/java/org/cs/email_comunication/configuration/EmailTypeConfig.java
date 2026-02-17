package org.cs.email_comunication.configuration;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.cs.email_comunication.utility.Email;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.mail.javamail.MimeMessageHelper;
/**
 * Configuration component responsible for implementing the {@link Email} data
 * to the MIME format.
 *
 * <p>
 *     This class prepare the {@link Email}  data to be transformed into MIME format.
 * </p>
 *
 * @see Email
 */
@Configuration
public class EmailTypeConfig {


    /**
     * Configuration method that returns {@link EmailContentStrategy} which transform
     * a simple email with only: text, context and receiving email to a MIME format
     *
     * @param emailBody email body data.
     * @see EmailContentStrategy
     * return EmailContentStrategy that gives the type of the MIME formatted massage
     */
    public EmailContentStrategy SimpleEmailBody(Email emailBody){
        return message -> {

            MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);

            messageHelper.setTo(emailBody.getReceiverAddress());
            messageHelper.setSubject(emailBody.getTitle());
            messageHelper.setText(emailBody.getContext());
        };
    }



}
