package Day6;
/*Given two strings a and b, return a new string, following the rules given below.
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
Example1)
i/p:abcXY123XYijk,XY
o/p:c13i
Example2)
i/p:XY123XY,XY
o/p:13
Example3)
i/p:XY1XY,XY
o/p:11*/

import java.util.Scanner;
public class HandsOn41 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String a=sc.next();
		String []b=a.split(",");
		String s=b[0];
		String s1=b[1];
		String s2="";
		for(int i=0;i<=s.length()-s1.length();i++)
		{
			String temp=s.substring(i,s1.length()+i);
			if(temp.contentEquals(s1))
			{
				if(i>0 && i<s.length()-1)
				{
					s2=s2+s.charAt(i-1);
				}
				if(i>0 && s1.length()+i<s.length())
				{
					s2=s2+s.charAt(s1.length()+i);
				}
			}
		}
		System.out.println(s2);
	}

}
