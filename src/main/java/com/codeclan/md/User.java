package com.codeclan.md;

public abstract class User {

	protected String name;
	protected String lastname;
	protected String email;

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String printUserDetails(){
		return "Name: "+name+", Last Name: "+lastname+", Email: "+email;
	}
}
