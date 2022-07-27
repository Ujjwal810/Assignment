package Day1;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n=sc.nextInt();
	    if(n>0)
	    {
	    	System.out.println("Number is positive");
	    }
	    if(n<0)
	    {
	    	System.out.println("Number is negative");
	    }
	    if(n==0)
	    {
	    	System.out.println("Number is equal to zero");
	    }
	}

}
