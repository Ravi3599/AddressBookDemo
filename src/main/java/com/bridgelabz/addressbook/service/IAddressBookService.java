package com.bridgelabz.addressbook.service;

import java.util.List;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;

//Created IAddressBookService interface to achieve abstraction
public interface IAddressBookService {

	public String getMessage();

	public AddressBook saveRecordToRepo(AddressBookDTO addressBookDTO);

	public List<AddressBook> getAllRecords();

	public AddressBook getRecordById(Integer id);

	public AddressBook updateRecordById(Integer id, AddressBookDTO addressBookDTO);

	public String deleteRecordById(Integer id);


	
	
}
