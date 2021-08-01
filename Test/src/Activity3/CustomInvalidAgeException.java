package Activity3;

import java.util.*;

class InvalidAgeException extends Exception{  
	InvalidAgeException(String s){  
		super(s);  
	}  
}


public class CustomInvalidAgeException {
	static int age;
	static String name;

	static void validate(int age)throws InvalidAgeException{  
	     if(age<19)  
	      throw new InvalidAgeException("InvalidAgeRangeException");  
	     else  
	    	System.out.println("Player name :"+name);
			System.out.println("Player age :"+age); 
	   } 
	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
	    try{
	    	System.out.println("Enter the player name");
			name = sc.nextLine();
			System.out.println("Enter the player age");
			age=sc.nextInt();
	    	validate(age);
	    }
	    catch(Exception m){System.out.println("Exception occured: "+m);}   
		
	}
	 
	     

}
