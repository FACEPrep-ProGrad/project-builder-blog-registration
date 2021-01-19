package businesslogic;


public class ValidateUser {


	public boolean validate(String email, String password) {
		
	    if(email!=null && password!=null)
		   if(email.equals("admin") && password.equals("admin"))
		     	return true;
		   else 
			   return false;
		else 
			return false;
	}

}

