package com.sap.contactApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.sap.contactApp.model.ContactModel;

public interface ContactRepo extends CrudRepository<ContactModel, String>{

}
