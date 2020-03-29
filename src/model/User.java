package model;

import java.time.LocalDate;


import java.time.LocalTime;
//Type your code here

public class User{
	public String name;
	String email;
	int date, month;
	String gender;
	public User(String name, String email, int date, int month, String gender) {

		this.name = name;
		this.email = email;
		this.date = date;
		this.month = month;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
		
	
}