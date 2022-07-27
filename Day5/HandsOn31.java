package Day5;
//Write a Program to check whether a given String is Palindrome or not.

import java.util.Scanner;

public class HandsOn31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
        	rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev))
        {
        	System.out.println("String is palindrome");
        }
        else
        {
        	System.out.println("String is not palindrome");
        }
	}

}
