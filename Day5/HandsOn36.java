package Day5;
//Given 2 strings, a and b, return a new string of the form short+long+short, 
//with the shorter string on the outside and the longer string on the inside.
//The strings will not be the same length, but they may be empty (length 0).
//If input is "hi" and "hello", then output will be "hihellohi"

import java.util.Scanner;
public class HandsOn36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1");
        String s1=sc.next();
        System.out.println("Enter the string2");
        String s2=sc.next();
        	if(s1.length()>s2.length())
        	{
        		System.out.println(s2+s1+s2);
        	}
        	else
        		System.out.print(s1+s2+s1);
	}

}