package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_s180250")
public class User {
	
	@Column(nullable= false)
	private String password;
	@Column(nullable=false)
	@Id
	private String email;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	private String firstname;
	private String lastname;
	private String phonenumber;
	@Column(name = "online_status")
	private boolean onlinestatus;
	
	public boolean isOnlinestatus() {
		return onlinestatus;
	}
	public void setOnlinestatus(boolean onlinestatus) {
		this.onlinestatus = onlinestatus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
