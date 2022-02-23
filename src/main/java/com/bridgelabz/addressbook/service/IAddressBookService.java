package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;

//Created IAddressBookService interface to achieve abstraction
public interface IAddressBookService {

	public String getMessage(String name);

	public String getWelcome(AddressBookDTO addressBookDTO);

	public String getHiMessage(String fName);

	public String getWelcomeMessage(String fName, String lName);

	
}
