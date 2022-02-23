package com.bridgelabz.addressbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}
