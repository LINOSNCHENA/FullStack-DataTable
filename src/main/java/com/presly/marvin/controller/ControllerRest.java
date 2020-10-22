package com.presly.marvin.controller;

import java.util.List;

import com.presly.marvin.model.Contact;
import com.presly.marvin.sevice.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

	@Autowired
	private ContactService cService;

	@RequestMapping(path = "/rusangu", method = RequestMethod.GET)
	public List<Contact> getContactsAll() {
		return cService.getAllContacts();
	}

	@RequestMapping(value = "/rusangu/{id}", method = RequestMethod.GET)
	public Contact getContactById(@PathVariable("id") long id) {
		return cService.getContactById(id);
	}

}
