package Day2;
import java.util.Scanner;

//Write a program to check if a given number is prime or not.
public class HandsOn11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int f=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				f++;
			}
		}
        if(f==0)
        	System.out.println("Number is Prime");
        else 
        	System.out.println("Number is not Prime");
	}

}
