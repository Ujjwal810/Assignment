package Day1;
import java.util.Scanner;

class Case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		if(Character.isUpperCase(c))
		{
			
			System.out.println(Character.toLowerCase(c));
		}
		else
		{
			System.out.println(Character.toUpperCase(c));
		}
	}

}
