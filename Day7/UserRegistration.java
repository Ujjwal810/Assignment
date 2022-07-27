package Day7;
/*A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India cannot be registered”
Example2)
i/p:Mini,India
o/p:User registration done successfully*/


import java.util.Scanner;

class InvalidCountryException extends Exception
{
	InvalidCountryException(String msg)
	{
		super(msg);
	}
}
public class UserRegistration {
	void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		String s2="India";
		if(userCountry.equalsIgnoreCase(s2))
			System.out.println("User registration done successfully");
		else
			throw new InvalidCountryException("User Outside India cannot be registered");
	}
	public static void main(String[] args) throws InvalidCountryException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of a person:");
		String s=sc.next();
		System.out.println("Enter the country of a person:");
		String s1=sc.next();
		UserRegistration obj=new UserRegistration();
		obj.registerUser(s,s1);
	}
}