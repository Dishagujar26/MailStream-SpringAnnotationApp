package com.disha.beans;

import org.springframework.stereotype.Component;

@Component
public class FileDataSource implements DataSource {

	@Override
	public String[] getEmail() {
		String[] emails = {"haluaa@gmail.com", "@gyanii@yahoo.in"};  
		return emails;
	}
       
}
