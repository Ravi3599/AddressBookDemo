package com.bridgelabz.addressbook.service;

import java.util.List;
import java.util.Optional;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;

//Created interface for all service methods so we can achieve abstraction
public interface IAddressBookService {
	public String getWelcome();
	public AddressBook saveDataToRepo(AddressBookDTO addressBookDTO);
	public AddressBook getRecordById(Integer id);
	public List<AddressBook> getRecord();
	public AddressBook updateRecordById(Integer id, AddressBookDTO addressBookDTO);
	public String deleteRecordById(Integer id);
	public List<AddressBook> getRecordByCity(String city);
}