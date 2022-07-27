package Day2;
import java.util.Scanner;

//Write a program to print * in Floyds format (using for and while loop)

public class HandsOn14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
		}
	}
}
