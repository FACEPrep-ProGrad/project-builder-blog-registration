package businesslogic;

import java.util.regex.Pattern;
import java.util.regex.*; 


public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword)
	{
		//System.out.println(validEmail(email)+"email");
		//System.out.println(validPassword(password, confirmPassword));
		if(validEmail(email) && validPassword(password, confirmPassword))
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	private boolean validPassword(String password, String confirmPassword)
	{
		if (password == null || confirmPassword==null) 
            return false; 
		else {
			 
			 String strongPass = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       
                       + "(?=\\S+$).{8,20}$";
			 Pattern pat = Pattern.compile(strongPass); 
			  Matcher m = pat.matcher(password); 
  
		        
		        boolean valid=m.matches(); 
		       System.out.println(valid+" valid");
		        if(valid && (password.contentEquals(confirmPassword)))
		        {
		        	return true;
		        }
		        else {
		        	return false;
				}
		        
		}
		
	    }  
		
	
	private boolean validEmail(String email)
	{
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                           "[a-zA-Z0-9_+&*-]+)*@" + 
                           "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                           "A-Z]{2,7}$";
		 Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    }
		
	}