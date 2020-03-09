package model;

import java.time.LocalDateTime;

//Type your code

//class user declaration
public class User
{
	String name;
	String password;
	LocalDateTime date;
	String email;
	
	
   
   // gettersetter
	
	
	public char[] getEmail() 
	{ char c[]=email.toCharArray();
		
		return c;
	}
	public char[] getPassword() {
		char c[]=password.toCharArray();
		return c;
	}
	
	public char[] getDate() {
		char c[]=password.toCharArray();
		return c;
	}
	
	
   public void setEmail(String email)
   {
	   this.email=email;
   }
   public void setPassword(String password)
   {
	   this.password=password;
   }
   public void setDate(LocalDateTime date2)
   {
     this.date=date2;
   	
   }
   
  
//constructor
public User(String name, String password, LocalDateTime date)
{
	   this.name=name;
	   this.password=password;
	   this.date=date;
	   
}
   
}