package Day5;
/*Write a java program that will concatenate 2 strings and return the result.
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar
Example2)
i/p:Mark,kate
o/p:markate*/

import java.util.Scanner;

public class HandsOn32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1");
        String s=sc.next();
        System.out.println("Enter the string2");
        String s1=sc.next();
        if(s.charAt(s.length()-1)==s1.charAt(0))
        		{
        	String s2=s.substring(0,s.length()-1)+s1.substring(1);
        	System.out.println(s2.toLowerCase());
        		}
        else
        {
        	String s2=s+s1;
        	System.out.println(s2.toLowerCase());
        }
	}

}
