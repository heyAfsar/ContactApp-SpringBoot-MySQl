package com.sap.contactApp.controller;

import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sap.contactApp.model.ContactModel;
import com.sap.contactApp.service.ContactService;

@RestController	//to restrict the data communication to JSON only
public class ContactController {

	@Autowired
	private ContactService cs;
	
	@RequestMapping("/getAllContacts")
	public List<ContactModel> getAllContacts(){
		return cs.getAllContacts();
		
	}
	@RequestMapping(method = RequestMethod.POST , path="/addContact")
	public ContactModel addContacts(@RequestBody ContactModel newContact){
		/*newContact.setName("afsar");
		newContact.setPhone("1234567890");*/
		return cs.addContacts(newContact);
	}
	
	@RequestMapping(method = RequestMethod.PUT , path="/updateContact")
	public ContactModel updateContact(@RequestBody ContactModel newContact){
		/*newContact.setName("afsar");
		newContact.setPhone("1234567890");*/
		return cs.addContacts(newContact);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , path="/deleteContact")
	public ContactModel deleteContact(@RequestBody ContactModel newContact){
		/*newContact.setName("afsar");
		newContact.setPhone("1234567890");*/
		
		return cs.deleteContact(newContact);
	}
	
}
