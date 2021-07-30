package tn.esprit;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.esprit.entities.Mail;
import tn.esprit.service.MailService;

@SpringBootApplication
public class GestionBancaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionBancaireApplication.class, args);
		
	}

}
