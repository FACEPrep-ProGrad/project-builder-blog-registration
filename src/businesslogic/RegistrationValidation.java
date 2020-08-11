package businesslogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationValidation{
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validEmail(email) && validPassword(password,confirmPassword)) {
			return true;
		}
		return false;
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		
		if(!password.equals(confirmPassword)) {
			return false; 
		}
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$"; 

		// Compile the ReGex 
		Pattern p = Pattern.compile(regex); 
		
		// Pattern class contains matcher() method to find matching between given password and regular expression. 
		Matcher m = p.matcher(password); 

		// Return if the password 
		// matched the ReGex 
		return m.matches(); 
	}
	
	private boolean validEmail(String email) {
		String regex1 = "^[A-Za-z0-9+_.-]+@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex1);
		 Matcher matcher = pattern.matcher(email);
		 
		 return matcher.matches();
	}
	
}

