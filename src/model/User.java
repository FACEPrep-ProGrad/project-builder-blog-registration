/*
 Progression - 1
Create a class called User inside the model package with the following arguments
String email
String password
LocalDateTime date
Generate appropriate getters and setters.
Generate a 3 argument constructor in the User class.

Progression - 2
Create a class called RegistrationValidation with the following methods
public boolean checkUserDetails(String email, String password, String confirmPassword)
private boolean validPassword(String password, String confirmPassword)
private boolean validEmail(String email)
CheckUserDetails should invoke two methods validPassword and validEmail.
Email should pass the following validations
Email can contain alphanumeric value
Allowed special characters - _, @, .[at, underscore, dot]
Email should not be empty.
Password should pass the following constraints
Password field should not be empty.
Password and confirm password should match.
Must contain atleast 8 characters and atmost 20 characters.
Must have atleast one uppercase letter, 1 lowercase letter and 1 number.

Progression - 3
Create an object for RegistrationValidation in the SignUpController class located inside JAVA Resources - src/controller
Call the checkUserDetails method with the object created*/

package model;
import java.time.LocalDateTime;
//Type your code here

public class User
{
	String email, password;
	LocalDateTime date;
	
	public User(String email, String password, LocalDateTime date)
	{
		this.email = email;
		this.password = password;
		this.date = date;
	}
	
	 public String getEmail() 
	 {
	    return this.email;
	 }
	 public void setEmail(String email) 
	 {
		 this.email = email;
	 }
	 
	 public LocalDateTime getDate() 
	 {
	    return this.date;
	 }
	 public void setDate(LocalDateTime date) 
	 {
		 this.date = date;
	 }
	 
	 public String getPassword() 
	 {
	    return this.password;
	 }
	 public void setPassword(String password) 
	 {
		 this.password = password;
	 }

	 @Override
	 public String toString() {
	 	return "User [email=" + email + ", password=" + password + ", date=" + date + "]";
	 }
}

