package Day2;
import java.util.Scanner;

public class HandsOn15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int n=sc.nextInt();
        while(n>0)
        {
        	int b=n%10;
        	System.out.print(b);
        	n=n/10;
        }
        
	}

}
