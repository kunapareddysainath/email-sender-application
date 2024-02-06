package com.ratanit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/")
    public void sendMail(@RequestParam String receiverMail,@RequestParam String subject, @RequestParam String body){
        emailService.sendEmail(receiverMail,subject,body);
    }

}
