package eTicaret.entities.concretes;

import eTicaret.entities.abstracts.Entity;

public class User implements Entity{
	//User Bilgileri
	private int id;
	private String email;
	private String password;
	private String name;
	private String lastName;
	
	//Parametresiz constructor
	public User() {
		
	}

	//Parametreli constructor
	public User(int id, String email, String password, String name, String lastName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
