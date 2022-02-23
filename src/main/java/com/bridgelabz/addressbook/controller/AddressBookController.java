package com.bridgelabz.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.service.IAddressBookService;

//Created controller class to make api calls
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	@Autowired
	IAddressBookService service;
	
	@GetMapping("/message")
	public String getMessage(@RequestParam String name) {
		return service.getMessage(name);
	}
	@PostMapping("/getMessage")
	public String getMessage(@RequestBody AddressBookDTO addressBookDTO) {
		return service.getWelcome(addressBookDTO);
	}
	@GetMapping("/getHi/{fName}")
	public String getHelloMessage(@PathVariable String fName) {
		return service.getHiMessage(fName);
	}
	@GetMapping("/getWelcome/{fName}")
	public String getHelloMessage(@PathVariable String fName,@RequestParam String lName) {
		return service.getWelcomeMessage(fName,lName);
	}	
}
