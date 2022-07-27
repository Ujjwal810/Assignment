package Day7;
/*Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
Display proper error messages.
The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
(Hint : Create a user defined exception class for handling errors.)*/


import java.util.Scanner;

class PersonMinor extends Exception
{
	PersonMinor(String msg)
	{
		super(msg);
	}
}
public class HandsOn51 {
	public static void main(String[] args) throws PersonMinor
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of a person:");
		String s=sc.next();
		System.out.println("Enter the age of a person:");
		int a=sc.nextInt();
		if(a<18)
			throw new PersonMinor(s+" is a minor");
		else 
			System.out.println(s+" is not minor");
	}

}
