package Day5;
/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string
where 'n' is the length of the string.
Example1)
i/p:Hello
o/p:HeHeHeHeHe*/

import java.util.Scanner;
public class HandsOn33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=sc.next();
        System.out.println("How many copies you want");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	System.out.print(s.charAt(0));
        	System.out.print(s.charAt(1));
        }
	}

}
