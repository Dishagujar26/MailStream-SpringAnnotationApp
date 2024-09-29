package com.disha.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
     private DataSource d;

	public EmailService( @Qualifier("mySQLDataSource") DataSource d) {
		this.d = d;
		System.out.println("I am constructor of EmailService...");
	}
	
	public  void sendEmails() {
		System.out.println("sending mails usinf "+d.getClass().getName());
		String [] email=d.getEmail();
		
		for(String emails:email) {
			System.out.println("Sending mail to : "+ emails);
		}
		
	}
     
}
