package Day7;
/*Write a Program with a division method which receives two integer numbers and performs the division operation.
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
*/

class HandsOn49
{
 public int division(int a,int b)
 {
     int c=a/b;
     return c;
 }

 public static void main(String[] args)
   {  
	 HandsOn49 obj=new HandsOn49();
	 try {
		 int z=obj.division(10, 0);
		 System.out.println("");
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println(e);
	 }
}
}