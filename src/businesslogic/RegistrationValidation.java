package businesslogic;

import java.util.regex.*;

public class RegistrationValidation{
	
	private boolean validPassword(String password, String confirmPassword) {
		String passwordPattern="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,20})";
		Pattern pass=Pattern.compile(passwordPattern);
		if(password==null)
			return false;
		if(password==confirmPassword)
			return true;
		return pass.matcher(password).matches();
	}
	
	private boolean validEmail(String email) {
		String emailContainer="^[a-zA-Z0-9_.]"+"@"+"[a-zA-Z0-9.]";
		Pattern ePat=Pattern.compile(emailContainer);
		if(email==null)
			return false;
		return ePat.matcher(email).matches();
	}
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validEmail(email) && validPassword(password,confirmPassword))
			return true;
		return false;
	}
	
}