package businesslogic;

import java.util.regex.*;
public class RegistrationValidation{
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) 
	{
		if(validEmail(email) && validPassword(password,confirmPassword))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
    //password validation
    private boolean validPassword(String password, String confirmpassword) 
    {
    	//using regex
    	String pass1=password;
    	String confirmpass=confirmpassword;
        String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"  + "(?=.*[@#$%^&+=])"+ "(?=\\S+$).{8,20}$"; 
        Pattern p = Pattern.compile(regex); 
        if (pass1 == null||pass1.matches(confirmpass)==false) 
        { 
            return false; 
        } 
 
        Matcher m = p.matcher(pass1); 
        return m.matches(); 
       
    }
    
    //email validation
    private boolean validEmail(String email) 
    {
    	String[] email1=email.split("@");
    	
	    //using regex
	    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+  "[a-zA-Z0-9_+&*-]+)*@" +  "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
	                  
		Pattern pat = Pattern.compile(emailRegex); 
		if (email1 == null) 
		{return false;} 
		return pat.matcher(email).matches();
	    
    }	
}	
