package Day1;
import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character variable");
        char i=sc.next().charAt(0);
        if((i>='a' && i<='z') || (i>='A' && i<='Z'))
        {
        	System.out.println("Alphabet");
        }
        else if((i>='0' && i<='9'))
        {
        	System.out.println("Digit");
        }
        else
        {
        	System.out.println("Special Character");
        }
        
	}

}
