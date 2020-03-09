package businesslogic;

//Type your code
public  class RegistrationValidation
{
	
	//details validation(check)
	public boolean checkUserDetails(String email, String password, String confirmPassword)
	{
		boolean var1=validPassword(password,confirmPassword);
		boolean var2=validEmail(email);
		if(var2&&var1)
		return true;
		else
			return false;
		
	}
	
	//password validation
	private boolean validPassword(String password, String confirmPassword)
	{   if(password.length()==0)
		return false;
		if(!(password.equals(confirmPassword)))
			return false;
		if(!((password.length()>=8)&&(password.length()<=20)))
              return false;
              char array[]=password.toCharArray();
         int capital=0;
         int lower=0;
         int num=0;
         
         
         
         //password contains uppercase,lower and num
         
         for(int i=0;i<password.length();i++)
         {
        	 if((array[i]>=65)&&(array[i]<=90))
        		 capital ++;
        	 else if((array[i]>=97)&&(array[i]<=122))
        		 lower ++;
        	 else if((array[i]>=48)&&(array[i]<=58))
        		 num ++;
        	 else
        		 return false;
         }
         if((capital>0)&&(lower>0)&&(num>0))
        	 return true;
		
         else
        	 return false;
		
		
	}
	
	
	//email content check
	private boolean validEmail(String email)
	{
	   
        String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Boolean b = email.matches(emailregex);
		return b;
		
	}
	
		
	
}