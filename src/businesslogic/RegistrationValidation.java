package businesslogic;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, 
			String confirmPassword)
	{
		return validPassword(password,confirmPassword)&&validEmail(email);
	}
	private boolean validPassword(String password, 
			String confirmPassword)
	{
		//check if password is empty
		if(password==null||confirmPassword==null)
			return false;
		
		//check if not password matches confirm password 
		if(!password.equals(confirmPassword))
			return false;
		
		//check if password pattern is valid
		Pattern pattern = Pattern.compile("(((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])).{8,20})");
        Matcher matcher = pattern.matcher(password);
        boolean isStringContainsSpecialCharacter = matcher.find();
        if(isStringContainsSpecialCharacter)
           return true;
        else    
           return false;
	}
	private boolean validEmail(String email)
	{
		//check if email is empty
		if(email==null)
			return false;
		else
		{
			//check if special characters are present
	        Pattern pattern = Pattern.compile("[a-zA-Z0-9_.]@[a-zA-Z0-9_.]\\.[a-zA-Z0-9_.]");
	        Matcher matcher = pattern.matcher(email);
	        boolean isStringContainsSpecialCharacter = matcher.find();
	        if(isStringContainsSpecialCharacter||email.contains("@")==false)
	           return false;
	        else    
	           return true;
		}
	}
}