package Day5;
import java.util.Scanner;

public class HandsOn34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=sc.next();
       if(s.length()%2==0)
       {
        for(int i=0;i<s.length()/2;i++)
        {
        	System.out.print(s.charAt(i));        
        }
       }
       else
       {
    		System.out.print("Null"); 
       }
    	   
	}

}
