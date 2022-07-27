package Day2;

//Write a program to print prime numbers between 10 and 99.
public class HandsOn12 {
		public static void main(String[] args) {
			System.out.println("Prime number between 10 and 99 are:");
			for(int j=10;j<99;j++)
			{
			int f=0;
			for(int i=2;i<j;i++)
			{
				if(j%i==0)
				{
					f++;
				}
			}
	        if(f==0)
	        {
	        	System.out.println(j);
	        }
	       }
		}
}
