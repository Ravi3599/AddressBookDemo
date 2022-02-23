package com.bridgelabz.addressbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;
import com.bridgelabz.addressbook.repository.AddressBookRepository;

//Created service class to serve api calls of controller
@Service
public class AddressBookService implements IAddressBookService{
	//Autowired AddressBookRepositoy to inject its dependency here
	@Autowired
	AddressBookRepository repo;
	
	//Created method which serve controllers api call to return welcome message
	public String getMessage() {
		return "Welcome to Address Book Application";
	}
	//Created method which serve controllers api call to save record to repo
	public AddressBook saveRecordToRepo(AddressBookDTO addressBookDTO) {
		AddressBook addressBook = new AddressBook(addressBookDTO);
		AddressBook newAddressBook = repo.save(addressBook);
		return newAddressBook;
	}
	//Created method which serves controllers api call to retrieve all records
	public List<AddressBook> getAllRecords() {
		List<AddressBook> list = repo.findAll();
		return list;
	}
	//Created method which serves controllers api call to retrieve record by id
	public AddressBook getRecordById(Integer id){
		Optional<AddressBook> newAddressBook = repo.findById(id);
		if(newAddressBook.isPresent()) {
			return newAddressBook.get();
		}
		else {
			return null;
		}
	}
	//Created method which serves controllers api call to update record by id
	public AddressBook updateRecordById(Integer id, AddressBookDTO addressBookDTO) {
		AddressBook newAddressBook = new AddressBook(id,addressBookDTO);
		AddressBook addressBook = repo.save(newAddressBook);
		return addressBook;
	}
	//Created method which serves controllers api call to delete record by id
	public String deleteRecordById(Integer id) {
		repo.deleteById(id);
		return null;
	}

}
