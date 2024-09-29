package com.disha.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.disha.beans.EmailService;

public class UseEmailService {
       public static void main(String[] args) {
    	   ApplicationContext container = new AnnotationConfigApplicationContext(com.disha.conf.AppConfig.class);
            System.out.println("Container started ");
		   
		    EmailService e = container.getBean(EmailService.class);
		    e.sendEmails();
		    
		    ((AbstractApplicationContext) container).close();
			}

	
}
