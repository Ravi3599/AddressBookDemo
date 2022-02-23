package com.bridgelabz.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookApplication.class, args);
		log.info("Address Book Application Started");
	}
}
