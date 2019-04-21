package com.sap.contactApp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity	//for generating rows during ORM(Object Relation Mapping)
@Table(name = "contactapp")
public class ContactModel{
	
	//@NotNull	//annotation for not null just like DB constraints, we can add annotations aKa field level constraints
	private String Name;
	
	@Id	//Since Phone in DB is set as Primary Key, we can also add joins and other stuff using annotations
	//@GeneratedValue
	private String Phone;
	


	public ContactModel(){
		
	}
	

	@JsonProperty("Name")
	public String getName() {
		return Name;
	}


	@JsonProperty("Name")
	public void setName(String name) {
		Name = name;
	}


	@JsonProperty("Phone")
	public String getPhone() {
		return Phone;
	}

	@JsonProperty("Phone")
	public void setPhone(String phone) {
		Phone = phone;
	}

}
