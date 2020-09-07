package businesslogic;
import java.util.regex.*;

public class RegistrationValidation {
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		
		boolean pass = validPassword(password, confirmPassword);
		boolean eml = validEmail(email);
		
		return (pass && eml);
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		
		if(!password.equals(confirmPassword) || password.equals(""))
			return false;
		else if(!(password.length() >= 8 && password.length() <= 20))
			return false;
		else if(!Pattern.matches("^(?=.*\\d)(?=.*[@])(?=.*[a-z])(?=.*[A-Z]).{8,20}$", password))
			return false;
		else
			return true;
		
	}
	
	private boolean validEmail(String email) {
	
		if(Pattern.matches("^(.+)@(.+)$", email))
			return true;
		else
			return false;
	}
}

