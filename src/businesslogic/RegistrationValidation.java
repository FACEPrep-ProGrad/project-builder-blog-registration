package businesslogic;

public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validPassword(password,confirmPassword) && validEmail(email)) {
			return true;
		}else {
			return false;
		}
	     	
	}
	private boolean validPassword(String password, String confirmPassword) {
		String regex = "^(?=.*[a-z])(?=."+ "*[A-Z])(?=.*\\d).+$";
		if(password.length() >= 8 && password.length() <= 20 && password.equals(confirmPassword) && password.matches(regex)) {
			return true;
		}
		return false;
	}
	private boolean validEmail(String email) {
		String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9.-]+$";
		if(email.length() > 0 && email.matches(regex)) {
			return true;
		}else {
			return false;
		}
		
	}
}