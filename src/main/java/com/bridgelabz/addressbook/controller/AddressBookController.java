package com.bridgelabz.addressbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbook.model.AddressBook;

//Created controller class to make api calls
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@GetMapping("/message")
	public String getMessage(@RequestParam String name) {
		return "Hello "+name;
	}
	@PostMapping("/getMessage")
	public String getMessage(@RequestBody AddressBook addressBook) {
		return "Hello "+addressBook.getFirstName()+" "+addressBook.getLastName();
	}
	@GetMapping("/getHi/{fName}")
	public String getHelloMessage(@PathVariable String fName) {
		return "Hi "+fName;
	}
	@GetMapping("/getWelcome/{fName}")
	public String getHelloMessage(@PathVariable String fName,@RequestParam String lName) {
		return "Welcome "+fName+" "+lName;
	}	
}
