/*
 
Progression - 2
Create a class called RegistrationValidation with the following methods
public boolean checkUserDetails(String email, String password, String confirmPassword)
private boolean validPassword(String password, String confirmPassword)
private boolean validEmail(String email)
CheckUserDetails should invoke two methods validPassword and validEmail.
Email should pass the following validations
Email can contain alphanumeric value
Allowed special characters - _, @, .[at, underscore, dot]
Email should not be empty.
Password should pass the following constraints
Password field should not be empty.
Password and confirm password should match.
Must contain atleast 8 characters and atmost 20 characters.
Must have atleast one uppercase letter, 1 lowercase letter and 1 number.
*/

package businesslogic;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class RegistrationValidation
{
	public boolean checkUserDetails(String email, String password, String confirmPassword)
	{
		boolean p = validPassword(password, confirmPassword);
		boolean e = validEmail(email);
		if(p && e)
			return true;
		else 
			return false;
	}
	private boolean validPassword (String password, String confirmPassword)
	{
		if(password.length()==0)
			return false;
		if(!(password.equals(confirmPassword)))
			return false;
		if(!((password.length()>=8) && (password.length()<=20)))
	        return false;
	
		char a[]=password.toCharArray();
		int capital=0;
        int lower=0;
        int num=0;
        int special=0;
        //Checking with their respective ASCII's
        for(int i=0;i<password.length();i++)
        {
       	 if((a[i]>=65)&&(a[i]<=90))
       		 capital ++;
       	 else if((a[i]>=97)&&(a[i]<=122))
       		 lower ++;
       	 else if((a[i]>=48)&&(a[i]<=58))
       		 num ++;
       	 else
       		 special ++;
       		 
        }
        if((capital>0)&&(lower>0)&&(num>0))
        	return true;
        else
        	return false;
		
	}
	private boolean validEmail(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
        if(pat.matcher(email).matches())
            return true;
        return false;
	}
}
