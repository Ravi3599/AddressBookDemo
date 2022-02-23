package com.bridgelabz.addressbook.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBook;
import com.bridgelabz.addressbook.service.IAddressBookService;

//Created controller class to make api calls
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	//Autowired service class to inject its dependency here
	@Autowired
	IAddressBookService service;
	
	//Ability to get welcome message
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome(){
		String message = service.getMessage();
		return new ResponseEntity(message,HttpStatus.OK);
	}
	//Ability to save data to repo
	@PostMapping("/create")
	public ResponseEntity<String> saveDatatoRepo(@Valid @RequestBody AddressBookDTO addressBookDTO){
		AddressBook addressBook = service.saveRecordToRepo(addressBookDTO);
		ResponseDTO dto = new ResponseDTO("Record Saved Successfully",addressBook);
		return new ResponseEntity(dto,HttpStatus.CREATED);
	}
	//Ability to retrieve all records
	@GetMapping("/get")
	public ResponseEntity<String> getAllDataFromRepo(){
		List<AddressBook> addressBook = service.getAllRecords();
		ResponseDTO dto = new ResponseDTO("All Records retrieved Successfully",addressBook);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
	//Ability to retrieve record by id
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getAllDataFromRepo(@PathVariable Integer id){
		AddressBook addressBook = service.getRecordById(id);
		ResponseDTO dto = new ResponseDTO("Record for given id retrieved Successfully",addressBook);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
	//Ability to update record for particular id
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateDataById(@PathVariable Integer id,@Valid @RequestBody AddressBookDTO addressBookDTO){
		AddressBook addressBook = service.updateRecordById(id,addressBookDTO);
		ResponseDTO dto = new ResponseDTO("Record for given id updated Successfully",addressBook);
		return new ResponseEntity(dto,HttpStatus.ACCEPTED);
	}
	//Ability to update record for particular id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteDataById(@PathVariable Integer id){
		ResponseDTO dto = new ResponseDTO("Record for given id updated Successfully",service.deleteRecordById(id));
		return new ResponseEntity(dto,HttpStatus.ACCEPTED);
	}
}
