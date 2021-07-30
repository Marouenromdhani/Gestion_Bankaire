package tn.esprit.controller;

import javax.mail.MessagingException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.MailService;
@RestController
public class SendEmailController {
	@Autowired
    private MailService mailService;
	@RequestMapping(value = "/testSendEmail" , method = RequestMethod.GET)
	public void sendEmail(String toEmail,String Subject,String body) throws MessagingException{
    	mailService.sendEmail("marouenromdhani19@gmail.com", "test1", "message1");
    	
    }

}
