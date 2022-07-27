package Day2;
import java.util.Scanner;

//Write a program to initialize an integer array with values and check if a given number is present in the array or not.
public class HandsOn20 {

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
		System.out.println("Enter the number you want to search");
		int b=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			int d=0;
			if(a[i]==b) {
				System.out.println("Number is present");
				d++;
			}
			else{
				System.out.println("Number is not present");
				d++;
			}			
			if(d!=0)
				break;
		}

	}

}
