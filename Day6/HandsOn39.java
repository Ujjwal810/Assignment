package Day6;
/*Given a string and an integer n, print a new string made of n repetitions of the 
last n characters of the string. You may assume that n is between 0 and the length of 
the string, inclusive. Example1)
i/p:Hello,3
o/p:llollollo*/


import java.util.Scanner;

public class HandsOn39 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string 1");
	String a=sc.next();
	String []b=a.split(",");
	String s=b[0];
	String s1=b[1];
	for(int i=0;i<s.length();i++)
	{
		System.out.print(s.charAt(i)+""+s1.charAt(i));
	}
	}

}
