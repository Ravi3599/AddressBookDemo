package com.bridgelabz.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbook.model.AddressBook;

public interface AddressBookRepository extends JpaRepository<AddressBook, Integer>{

}
