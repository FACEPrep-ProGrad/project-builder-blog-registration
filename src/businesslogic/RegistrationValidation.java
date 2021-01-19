package businesslogic;

import org.hamcrest.core.Is;

public class RegistrationValidation {
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		System.out.println(validPassword(password,confirmPassword) );
		System.out.println(validEmail(email));
		if (validPassword(password,confirmPassword) && validEmail(email))
			return true;
		return false;
	}
	private boolean validPassword(String password, String confirmPassword) {
		if (password != null && password.equals(confirmPassword)) {
			boolean isUpper=false,isLower=false,isNumber=false,isLength=false;
			int n=password.length();
			if (n>= 8 && n<=20)
				isLength=true;
			for(int i=0;i<password.length();i++) {
				if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
					isUpper=true;
				if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
					isLower=true;
				if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
					isNumber=true;
			}
			if (isUpper && isLower && isNumber && isLength)
				return true;
			return false;
		}
		else
			return false;
		
		
		
		/*
		if (password != null && password.equals(confirmPassword) && password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,20}$"))
			return true;
		return false;
		*/
	}
	private boolean validEmail(String email){
		if (email.length() != 0) {
		boolean isat=false,isDot =false;
		for(int i=0;i<email.length();i++) {
			if (!((email.charAt(i) >= 'A' && email.charAt(i) <= 'Z') || (email.charAt(i) >= 'a' && email.charAt(i) <= 'z') || (email.charAt(i) >= '0' && email.charAt(i) <= '9') || email.charAt(i) == '_')) {
				if (email.charAt(i) == '.' )
					isDot=true;
				else if(email.charAt(i) == '@')
					isat=true;
				else
					return false;
			}
		}
		if (isat && isDot)
			return true;
		return false;
		}
		else
			return false;
		/*
		if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
			return true;
		return false;
		*/
	}
} 