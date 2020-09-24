package businesslogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegistrationValidation{
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		boolean isValid = false;
		
		boolean p = validPassword(password, confirmPassword);
		boolean e = validEmail(email);
		
		if(p && e) {
			isValid = true;
		}
		
		return isValid;
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		
		boolean isValid = false;
		
		if(password != confirmPassword  || password == null) {
			isValid = false;
			return isValid;
		}
		
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,20}$";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(password);
		
		if(m.matches()) {
			isValid = true;
		}
		
		
		return isValid;
	}
	
	private boolean validEmail(String email) {
		boolean isValid = false;
		
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		
		if(m.matches()) {
			isValid = true;
		}
		
		return isValid;
		
	}
}