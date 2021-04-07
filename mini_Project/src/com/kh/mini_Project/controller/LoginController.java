package com.kh.mini_Project.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.mini_Project.model.Person;

public class LoginController {

	public boolean loginCheck(String inputId, char[] inputPwd) {
		boolean result = false;
		
		FileInputStream fis = null;
		
		ArrayList<Person> userList = new ArrayList<>();
		
		File file = new File("user.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String txtRead;
		    String userArray[] = new String[4];
		    while ((txtRead = br.readLine()) != null) {
		    	Person user = new Person();
		        userArray = txtRead.split(", ");
		        user.setId(userArray[0]);
		        user.setPw(userArray[1]);
		        user.setName(userArray[2]);
		        user.setAge(Integer.parseInt(userArray[3]));
		        
		        userList.add(user);
		    }
		    
		    for(Person item : userList) {
		    	if(item.getId().equals(inputId) && item.getPw().length() == inputPwd.length) {
		    		result = true;
		    	}
		    }
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return result;
		
	}
	
	

}
