package model;
import java.time.*;
public class User{
	String email;
	String password;
	LocalDateTime date;
	public User(String e,String p,LocalDateTime d){
		this.email=e;
		this.password=p;
		this.date=d;
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
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
}