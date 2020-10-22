package com.presly.marvin.sevice;

import java.util.List;
import com.presly.marvin.model.Contact;
import com.presly.marvin.repository.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cService")
public class ContactServiceImpl implements ContactService {

	@Autowired
	private Repo ContactRepository;

	@Override
	public List<Contact> getAllContacts() {
		return ContactRepository.findAll();
	}

	@Override
	public Contact getContactById(long id) {
		return ContactRepository.getOne(id);
	}

}
