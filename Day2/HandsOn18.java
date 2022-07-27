package Day2;
import java.util.Scanner;

//Write a program to initialize an integer array and print the sum and average of the array.

public class HandsOn18 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many number you want");
	int n=sc.nextInt();
	System.out.println("Enter the number");
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	int avg=sum/n;
    System.out.println("Sum is:"+sum);
    System.out.println("Average is:"+avg);
	}

}
