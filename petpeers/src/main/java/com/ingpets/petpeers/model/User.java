package com.ingpets.petpeers.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class User{
	
	@Id
	private int UserId;
	@NotNull
	private  String UserName;
	@NotNull
	private  String UserPassword;
}
