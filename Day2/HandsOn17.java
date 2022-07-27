package Day2;
//Write a program to print first 5 values which are divisible by 2, 3, and 5.
public class HandsOn17 {

	public static void main(String[] args) {
        int g=1;
		for (int i=1;i<1000;i++)
        {
			int f=0;
        	if(i%2==0 && i%3==0 && i%5==0) {
        		f++;
        	}
        	if(f!=0)
        	{
        		System.out.println(i);
        		g++;
        	}
        	if(g>5)
        	{
        		break;
        	}
        }
        	
        
	}

}
