package com.ratanit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${app.sender.mail}")
    private String senderEmail;

    public void sendEmail(String receiverEmail,String subject,String body){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(senderEmail);
        message.setTo(receiverEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        System.out.println("e-Mail sent successfully");

    }

}
