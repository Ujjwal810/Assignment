package Day2;
import java.util.Scanner;

//Initialize an integer array with ascii values and print the corresponding character values in a single row.
public class HandsOn21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number you want");
		int n=sc.nextInt();
		System.out.println("Enter the number to find ascii value");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print((char)a[i]+" ");
		}
	}

}
