package org.cs.email_comunication.controller;


import jakarta.validation.Valid;
import lombok.SneakyThrows;
import org.cs.email_comunication.configuration.EmailTypeConfig;
import org.cs.email_comunication.dto.request.EmailBodyRequest;
import org.cs.email_comunication.service.abstraction.IEmailService;
import org.cs.email_comunication.utility.Email;
import org.cs.payload.SuccessPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    private IEmailService emailService;

    private EmailTypeConfig emailTypeConfig;

    public EmailController(IEmailService emailService, EmailTypeConfig emailTypeConfig){
        this.emailService = emailService;
        this.emailTypeConfig = emailTypeConfig;
    }

    /**
     * This controller sends email which contains only:
     * <br>
     *      - Title for the email;<br>
     *      - Context for the email.<p>
     *
     *
     * @param requestEmailBody email body attributes.
    */
    @SneakyThrows
    @PostMapping("/notifier")
    public ResponseEntity<SuccessPayload> sendEmail(@Valid @RequestBody EmailBodyRequest requestEmailBody){

        Email emailBody = new Email.EmailBuilder(requestEmailBody.receiverAddress())
                                                 .setTitle(requestEmailBody.title())
                                                 .setContext(requestEmailBody.context())
                                                 .buildEmailBody();

        emailService.sendMessage(emailTypeConfig.SimpleEmailBody(emailBody));


        SuccessPayload payload = SuccessPayload.builder().
                                                httpStatus(HttpStatus.OK).
                                                response(String.format("This email is sent successfully to ' %s '!",requestEmailBody.receiverAddress())).build();

        return ResponseEntity.ok(payload);
    }

}
