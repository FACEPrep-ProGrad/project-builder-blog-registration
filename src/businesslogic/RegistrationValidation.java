package businesslogic;

public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validPassword(password,confirmPassword)&&validEmail(email))
		return true;
		else 
		return false;
	}
	//password validation
	private boolean validPassword(String password, String confirmPassword) {
		String smallAlpha="abcdefghijklmnopqrstuwxyz";
		String numbers="1234567890";
		String capsAlpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if((password!=" ")&&(password.equals(confirmPassword))&&(password.length()>=8 && password.length()<=20))
		{
			if(isPresent(password,smallAlpha)&& isPresent(password,capsAlpha)&& isPresent(password,numbers)) 
			{
				return true;
			}
		}
		return false;
}	
	
	
	//email validation
	private boolean validEmail(String email) {
		String alpha="abcdefghijklmnopqrstuwxyz";
		String numbers="1234567890";
		String spclChars="_-,@.,";
		int alphaFlag=0,numFlag=0,splFlag=0;
		if(email!=" ") 
		{
			if(isPresent(email,alpha) &&isPresent(email,numbers)&&isPresent(email,spclChars))
			{
				 return true;
			}
		}
		return false;
	}
	
	
public boolean isPresent(String a, String b) {
	for(int index=0;index<a.length();index++) {
		for(int index1=0;index1<b.length();index1++) {
			if(a.charAt(index)==b.charAt(index1)) {
				return true;
			}
		}
	}
	return false;
}
}