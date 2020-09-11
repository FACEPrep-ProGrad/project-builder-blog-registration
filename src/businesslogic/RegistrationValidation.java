package businesslogic;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegistrationValidation {
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
			return false;
		}
	
	
	 
	boolean emailtemp=validEmail(email);
	boolean passwordtemp=validPassword(password,confirmPassword);
	
	return (emailtemp && passwordtemp);
	}
		
		
		
		private boolean validEmail(String email) {
			
			boolean characterstemp=!Pattern.compile("[^a-zA-Z0-9@_.]").matcher(email).find();
			boolean attemp=Pattern.compile("@").matcher(email).find();
			
			return (characterstemp && attemp);
		
	}
	
	private boolean validPassword(String password,String confirmPassword) {
		if(!password.isEmpty() && password.contentEquals(confirmPassword) && password.length()>=8 && password.length()>=20) {
			
			boolean capital=Pattern.compile("[A-Z]").matcher(password).find();
			boolean small=Pattern.compile("[a-z]").matcher(password).find();
			boolean num=Pattern.compile("[0-9]").matcher(password).find();
			boolean special=Pattern.compile("[!@#$%&*()-+=^]").matcher(password).find();			
			return (capital && small && num && special);
		}return false;
	}

}

