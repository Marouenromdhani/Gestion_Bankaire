package tn.esprit.service;

import tn.esprit.entities.Mail;

public interface MailService {
	public String sendEmail(String toEmail,String Subject,String body);
	

}
