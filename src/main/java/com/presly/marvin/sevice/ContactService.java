package com.presly.marvin.sevice;

import java.util.List;
import com.presly.marvin.model.Contact;

public interface ContactService {

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);

}
