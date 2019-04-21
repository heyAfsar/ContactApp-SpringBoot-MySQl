package com.sap.contactApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.contactApp.model.ContactModel;
import com.sap.contactApp.repository.ContactRepo;

@Service
public class ContactService {
	@Autowired
	private ContactRepo cr;
	
	public List<ContactModel> getAllContacts(){
		List<ContactModel> response = new ArrayList<ContactModel>();
		
		cr.findAll().forEach(response ::add);
		
		return response;
	}
	
	
	public ContactModel addContacts(ContactModel newContact){
	
		return cr.save(newContact);
	}


	public ContactModel deleteContact(ContactModel newContact) {
		// TODO Auto-generated method stub
		cr.delete(newContact);
		return newContact;
	}
	

}
