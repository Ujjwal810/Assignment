package Day1;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first character");
		char a=sc.next().charAt(0);
		System.out.println("Enter the second character");
		char b=sc.next().charAt(0);
		if(a>b)
	    {
	      	System.out.println(b+","+a);
	    }
		if(a<b)
        {
        	System.out.println(a+","+b);
        }
       
	}

}
