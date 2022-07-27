package Day5;
//Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
//otherwise return the string unchanged.
//If the input is "xHix", then output is "Hi".
//If the input is "America", then the output is "America"


import java.util.Scanner;
public class HandsOn37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=sc.next();
        	if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')
        	{
        			System.out.print(s.substring(1,s.length()-1));
        	}
        	else
        	{
        		System.out.println(s);
        	}
	}

}
