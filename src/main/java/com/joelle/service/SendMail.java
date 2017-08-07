package com.joelle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMail {
	@Autowired
	private JavaMailSender emailSender;
	
	public void sendMail(String toEmail, String subject, String message) {
		SimpleMailMessage simpleMail = new SimpleMailMessage();
		simpleMail.setTo(toEmail);
		simpleMail.setSubject(subject);
		simpleMail.setText(message);
		emailSender.send(simpleMail);
	}
}	
