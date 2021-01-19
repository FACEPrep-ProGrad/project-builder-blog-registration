package businesslogic;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 


public class RegistrationValidation{
	
	
	String email,password,confirmpassword;
	
	public boolean checkUserDetails(String email, String password, String confirmpassword) {
		if(validEmail(email)&&validPassword(password,confirmpassword)) {
			return true;
		}
		else
			return false;
	}
//password validation
	
    private boolean validPassword(String password, String confirmpassword) {
    	//using regex
    	
    	//String pass1=password;
    	//String confirmpass=confirmpassword;
        //String regex = "^(?=.*[0-9])"
        //               + "(?=.*[a-z])(?=.*[A-Z])"
        //               + "(?=.*[@#$%^&+=])"
        //               + "(?=\\S+$).{8,20}$"; 
        //Pattern p = Pattern.compile(regex); 
       // if (pass1 == null||pass1.matches(confirmpass)==false) { 
        //    return false; 
       // } 
 
       // Matcher m = p.matcher(pass1); 
       // return m.matches(); 
    	//without regex
    	
    	if(password.equals(confirmpassword)==false)
    		return false;
    	boolean lowercase=false;
    	boolean uppercase=false;
    	boolean hasdigit=false;
    	if(password.length()>8 &&password.length()<20) {
    		for(int i=0;i<password.length();i++) {
    			char ch=password.charAt(i);
    			if(Character.isUpperCase(ch))
    				uppercase=true;
    			if(Character.isLowerCase(ch)) 
    				lowercase=true;
    			if(Character.isDigit(ch))
    				hasdigit=true;
    			
    		if(lowercase&&uppercase&&hasdigit)
    			return true;
    		}
    	}
    	return false;
    }
    
//email validation
    private boolean validEmail(String email) {
    	String[] email1=email.split("@");
    	
//using regex
		 //String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
               // "[a-zA-Z0-9_+&*-]+)*@" + 
               // "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                //"A-Z]{2,7}$"; 
                  
//Pattern pat = Pattern.compile(emailRegex); 
//if (email1 == null) 
//{return false;} 
//return pat.matcher(email1).matches();
    	
//without adding regex
    for(int i=0;i<email.length();i++) {
    	char ch=email.charAt(i);
    	if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch!='.' && ch!='@' && ch!='_')
    		return false;
    }
    if(email1[0].length()==0)
    	return false;
    if(email1.length!=2)
    	return false;
    if(email1[1].contains(".")==false)
    	return false;
    return true;
    }	
    }

