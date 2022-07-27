package Day5;
//Write a java program that accepts a string and returns a new string without the first 
//and last character of the input string.

import java.util.Scanner;
public class HandsOn35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
        	if(i==0 || i==s.length()-1)
        		continue;
        	else
        		System.out.print(s.charAt(i));
        }
	}

}
