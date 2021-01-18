package businesslogic;

public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validPassword(password,confirmPassword) &&validEmail(email )) {
			return true;
		}
		return false;
	}
	private boolean validPassword(String password, String confirmPassword) {
		if(!password.equals(confirmPassword)) {
			return false;
		}
		boolean hasLowerCaseLetter = false;
        boolean hasDigit = false;
        boolean hasUpperCaseLetter = false;
		if (password.length() >= 8 && password.length()<=20) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLowerCase(x)) {

                    hasLowerCaseLetter = true;
                }
                if (Character.isUpperCase(x)) {

                    hasUpperCaseLetter = true;
                }
                else if (Character.isDigit(x)) {

                    hasDigit = true;
                }

                if(hasLowerCaseLetter && hasDigit && hasUpperCaseLetter){

                    return true;
                }

            }
		}
		return false;
		
	}
	private boolean validEmail(String email) {
		String[] emailParts = email.split("@");
	    
	    for(int i=0;i<email.length();i++) {
	    	char ch = email.charAt(i);
	    
	    	if(!Character.isLetter(email.charAt(i)) &&  !Character.isDigit(email.charAt(i)) && ch!='.' && ch!='_' && ch!='@' ) {
	    		return false;
	    	}
	    	
	    	
	    }
	    if (emailParts.length != 2) {
	        return false;
	    }

	    if (emailParts[0].length() == 0 ) {
	        return false;
	    }
	    if(emailParts[1].contains(".")==false)
	        return false;
	    
	  		
		return true;
	}
	
	
}