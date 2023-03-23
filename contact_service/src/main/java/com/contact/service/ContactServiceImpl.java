package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	// fake list of contacts
	
			List<Contact> list=List.of(
					new Contact(1, "amit@gmail.com", "Amit", 3329),
					new Contact(2, "ankit@gmail.com", "Ankit", 3330),
					new Contact(3, "anil@gmail.com", "Anil", 3331),
					new Contact(4, "rohan@gmail.com", "Rohan", 3332)
					);
			
	
	@Override
	public List<Contact> getContactOfUser(Integer userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
