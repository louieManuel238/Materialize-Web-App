package com.materialize.model;

import java.io.Serializable;

/**
 * This class represents the User model. This model class can be used throughout 
 * all layers, Data layer, controller layer, and view layer
 *
 * @author Louie
 */

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;

	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getFirstname(){
		return firstname;
	}
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	public String getLastname(){
		return lastname;
	}
	public void setLastname(String lastname){
		this.lastname;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	@override
	public boolean equals(Object other){
		return (other instanceof User) && (id != null)
				? id.equals(((User)other).id)
				: (other == this);
	}
	@override
	public int hashCode(){
		return (id != null) ? (this.getClass().hashCode()+id.hashCode()) : super.hashCode();
	}
}