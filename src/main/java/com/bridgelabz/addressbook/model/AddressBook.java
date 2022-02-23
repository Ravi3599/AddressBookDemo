package com.bridgelabz.addressbook.model;

import lombok.Data;

@Data
public class AddressBook {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String city;
	private String state;
	private Integer zip;
	
	public AddressBook() {
		super();
	}
}
