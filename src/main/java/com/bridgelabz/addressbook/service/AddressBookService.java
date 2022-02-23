package com.bridgelabz.addressbook.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;

//Created service class to serve api calls of controller
@Service
public class AddressBookService implements IAddressBookService{
	public String getMessage(String name) {
		return "Hello "+name;
	}
	public String getWelcome(AddressBookDTO addressBookDTO) {
		return "Hello "+addressBookDTO.getFirstName()+" "+addressBookDTO.getLastName();
	}
	public String getHiMessage(String fName) {
		return "Hi "+fName;
	}
	public String getWelcomeMessage(String fName, String lName) {
		return "Welcome "+fName+" "+lName;
	}
}
