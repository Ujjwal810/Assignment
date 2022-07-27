package Day6;
/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
Example1)
i/p:Hello,3
o/p:llollollo*/

import java.util.Scanner;

public class HandsOn40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String s=sc.next();
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=s.length()-n;j<s.length();j++)
			{
				System.out.print(s.charAt(j));
			}
		}

	}

}
