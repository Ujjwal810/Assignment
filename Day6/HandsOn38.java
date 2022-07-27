package Day6;
/*Write a Java program that accepts a string (with * in it). The program should return a new 
 * string in which the following characters are removed-*,* the characters that are to the
*  left *  and right of * Example1) i/p:ab*cd
                                    o/p:ad*/

import java.util.Scanner;
public class HandsOn38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=sc.next();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='*')
        	{
              s1=s.substring(0,i-1);
              i++;
        	}
        	else
        	{
        		s1=s1+s.charAt(i);
        	}
        }
        System.out.println(s1);
	}

}
