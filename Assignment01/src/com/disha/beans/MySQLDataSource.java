package com.disha.beans;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{
	
	private String[] emails= {"abc@gmail.com","xyz@yahoo.com","ebc@gmail.com"};

	@Override
	public String[] getEmail() {	
		return emails;
	}
        
}
