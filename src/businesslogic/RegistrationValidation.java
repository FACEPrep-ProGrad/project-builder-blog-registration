
/*
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
import java.util.regex.*;
public class RegistrationValidation {
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		boolean valid_pass = validPassword(password, confirmPassword);
		boolean valid_email = validEmail(email);
		if((valid_pass ==true) && (valid_email == true)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		String pass_regex =  "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";
		boolean pass = Pattern.compile(pass_regex).matcher(password).matches();
		boolean con_pass = Pattern.compile(pass_regex).matcher(confirmPassword).matches();
		if(pass == true && con_pass == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean validEmail(String email) {
		
		String email_regex = "^[\\w]+(\\.[\\w-]+)*@[a-zA-Z]+(\\.[a-zA-Z]+)$";
		boolean e = Pattern.compile(email_regex).matcher(email).matches();
		
		if(e == true) {
			return true;
		}
		else {
			return false;
		}
	}
}