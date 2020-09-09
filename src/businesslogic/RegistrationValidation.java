package businesslogic;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationValidation {
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		
		
		//if email or password or confirmPassword is not given then it will return false
		if(email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
			return false;
		}
		
		// will check if email is valid
		boolean emailFlag = validEmail(email);
		
		// will check if password is valid or not
		boolean passwordFlag = validPassword(password, confirmPassword);
		
		return (emailFlag && passwordFlag);
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		
		if(!password.isEmpty() && password.contentEquals(confirmPassword) && password.length() >= 8 && password.length() <=20) {
			
			// checking if password contains small case letters
			boolean capsFlag = Pattern.compile("[a-z]").matcher(password).find();  
			// checking if password contains upper case letters
			boolean smallFlag = Pattern.compile("[A-Z]").matcher(password).find();
			// checking if password contains numbers
			boolean numberFlag = Pattern.compile("[0-9]").matcher(password).find();
			
			return (capsFlag && smallFlag && numberFlag);
			
		}
		return false;
		
	}
	
	private boolean validEmail(String email) {
		
		// if email contains any other special character other than A-z, 0-9 and @,  period or underscore it will return false.
		
		boolean charactersFlag = !Pattern.compile("[^a-zA-Z0-9@_.]").matcher(email).find();
		boolean atFlag = Pattern.compile("@").matcher(email).find();
		
		return (charactersFlag && atFlag);
	}
}

