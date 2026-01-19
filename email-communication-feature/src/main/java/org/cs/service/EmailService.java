package org.cs.service;

import org.cs.repository.abstraction.IEmailRepository;
import org.cs.service.abstraction.IEmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {

    private IEmailRepository emailRepository;

    public EmailService(IEmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }





}
