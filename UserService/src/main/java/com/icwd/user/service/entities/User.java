package com.icwd.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;



@Entity
@Data
public class User {
	
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "NAME",length = 20)
	private String name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ABOUT")
	private String about;
	
	//other properties 
	@Transient
	private List<Rating> ratings=new ArrayList<>();
	
}
