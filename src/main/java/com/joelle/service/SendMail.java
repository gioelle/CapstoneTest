package com.joelle.service;

import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.joelle.constant.SwapBuyerEmailMessage;
import com.joelle.entity.Posting;
import com.joelle.entity.User;

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

	public void sendSwapBuyerEmail(User loggedInUser, User postedUser, Posting post) {
		MimeMessage message = emailSender.createMimeMessage();

		try {
			message.setSubject("SwaProcity - Thanks for Swapping By!");
			MimeMessageHelper helper;
			helper = new MimeMessageHelper(message, true);
			helper.setSentDate(new Date());
			helper.setTo(loggedInUser.getEmail());
			helper.setText(
					SwapBuyerEmailMessage.buildSwapBuyerEmail(loggedInUser, postedUser, post)
					, true);
			emailSender.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sendSwapSellerEmail(User loggedInUser, User postedUser, Posting post) {
		MimeMessage message = emailSender.createMimeMessage();

		try {
			message.setSubject("SwaProcity - Your Post Is Being Swapped!");
			MimeMessageHelper helper;
			helper = new MimeMessageHelper(message, true);
			helper.setSentDate(new Date());
			helper.setTo(postedUser.getEmail());
			helper.setText(
					SwapBuyerEmailMessage.buildSwapBuyerEmail(loggedInUser, postedUser, post)
					, true);
			emailSender.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
