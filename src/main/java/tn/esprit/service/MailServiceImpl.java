package tn.esprit.service;

import java.io.UnsupportedEncodingException;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;



import tn.esprit.entities.Mail;
@Service("mailService")
public class MailServiceImpl implements MailService{
	 @Autowired
	    JavaMailSender mailSender;
	 SimpleMailMessage message= new SimpleMailMessage();
	@Override
	public String sendEmail(String toEmail, String Subject, String body) {
		// TODO Auto-generated method stub
		message.setFrom("marouenromdhani19@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(Subject);
		mailSender.send(message);
		return "mail envoyer";
		
	}
	
	
		
	}


