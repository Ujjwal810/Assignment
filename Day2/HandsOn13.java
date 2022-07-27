package Day2;
import java.util.Scanner;

//Write a program to print the sum of all the digits of a given number.
public class HandsOn13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
        	int b=n%10;
        	sum=sum+b;
        	n=n/10;
        }
        System.out.println(sum);
	}

}
