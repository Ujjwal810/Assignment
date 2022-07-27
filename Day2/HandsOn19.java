package Day2;
//Write a program to initialize an integer array and find the maximum and minimum value of the array.
import java.util.Arrays;
import java.util.Scanner;
public class HandsOn19 {

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
		int max=0,min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}			
		}
		System.out.println("Maximum number is:"+max);
		System.out.println("Minimum number is:"+min);
	}

}
