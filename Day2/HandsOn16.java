package Day2;
import java.util.Scanner;

//Write a Java program to find if the given number is palindrome or not
public class HandsOn16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int rev=0,rem;
        while(temp>0)
        {
        	rem=temp%10;
        	rev=(rev*10)+rem;
        	temp=temp/10;
        }
        if(rev==n) {
          System.out.println("Number is Palindrome");
	    }
        else {
          System.out.println("Number is not Palindrome");
        }
	}
}
