package Day3;
//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

import java.util.Arrays;
import java.util.Scanner;

public class HandsOn22 {

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
		System.out.println("Largest "+a[n-1]+" "+a[n-2]);
		System.out.println("Smallest "+a[0]+" "+a[1]);
	}

}
