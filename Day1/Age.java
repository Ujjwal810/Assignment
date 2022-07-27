package Day1;
import java.util.Scanner;

class Age {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the gender");
    String s=sc.next();
    System.out.println("Enter the age");
    int a=sc.nextInt();
    if(s.equals("Female"))
    {
    	if(a>=1 && a<=58)
    	{
    		System.out.println("Percentage of interest is 8.2%");
    	}
    	if(a>=59 && a<=100)
    	{
    		System.out.println("Percentage of interest is 9.2%");
    	}
    }
    if(s.equals("Male"))
    {
    	if(a>=1 && a<=58)
    	{
    		System.out.println("Percentage of interest is 8.4%");
    	}
    	if(a>=59 && a<=100)
    	{
    		System.out.println("Percentage of interest is 10.5%");
    	}
    }
	}

}
