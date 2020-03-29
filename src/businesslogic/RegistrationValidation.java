package businesslogic;
//Type your code
public class RegistrationValidation{
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		boolean emailValid = validEmail(email);
		boolean passwordValid = validPassword(password,confirmPassword);
		if(emailValid && passwordValid) {
			return true;
		}
		else {
			return false;
		}
	}
	private boolean validPassword(String password, String confirmPassword) {
		if(password.length()==0) {
			return false;
		}
		else if(password != confirmPassword) {
			return false;
		}
		else if(password.length()<8 || password.length() > 20) {
			return false;
		}
		else {
			char pass[]= password.toCharArray();
			int upper=0,lower=0,number=0;
			for (int i=0;i<pass.length;i++){
				if(pass[i]>64 && pass[i]<91)
					upper++;
				if(pass[i]>96 && pass[i]<123)
					lower++;
				if(pass[i]>47 && pass[i]<58)
					number++;
				
			}
			if(upper>0 && lower>0 && number>0)
				return true;
			else
				return false;
		}
		
	}
	private boolean validEmail(String email) {
		String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
      boolean b = email.matches(emailregex);
		return b;
	}
}


