package businesslogic;
import java.util.regex.*;
public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword)
	{
		if(validPassword(password, confirmPassword) && validEmail(email))
			return true;
		else
			return false;
	}
	private boolean validPassword(String password, String confirmPassword)
	{
		if (password == null ) { 
		      return false; 
		  }
		if(password.equals(confirmPassword))
		{
			String regex = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?\\W).*$"; 
			
				Pattern p = Pattern.compile(regex); 
				Matcher m = p.matcher(password); 
				 if(m.matches())
		    	return true;
				 else
					 return false;
		
		}
		else 
			return false;
	}
	private boolean validEmail(String email)
	{
	
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                           
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
		return false; 
		return pat.matcher(email).matches(); 
		
	}
}
