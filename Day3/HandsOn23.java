package Day3;
//Write a program to initialize an array and print them in a sorted order.
import java.util.Arrays;
import java.util.Scanner;

public class HandsOn23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number you want");
		int n=sc.nextInt();
		System.out.println("Enter the number");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ " ");
		}
	}

}
