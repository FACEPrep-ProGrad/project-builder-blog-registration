package model;

import java.time.LocalDateTime;

public class User {
	//String name;
	String email;
	String password;
	LocalDateTime date;
	
	public User(String email, String password, LocalDateTime dateTime) {
		//this.name=name;
		this.email=email;
		this.date=dateTime;
		this.password = password;
		
	}
//	public void setName(String name) {
//		this.name=name;
//	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setDate(LocalDateTime date) {
		this.date=date;
	}
//	public String getName() {
//		return this.name;
//	}
	public String getEmail() {
		return this.email;
	}
	public LocalDateTime getDate() {
		return this.date;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}