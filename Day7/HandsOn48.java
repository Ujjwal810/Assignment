package Day7;
/* Write a Program to take care of Number Format Exception if user enters values other than integer 
 * for calculating average marks of 2 students. The name
 of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/

import java.util.Scanner;
class NegativeValueException extends Exception
{
	NegativeValueException(String message)
	{
		super(message);
	}
}
class OutOfRangeException extends Exception
{
	OutOfRangeException(String message)
	{
		super(message);
	}
}
public class HandsOn48 {

	public static void main(String[] args) throws OutOfRangeException, NegativeValueException
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int avg2=0,avg1=0,avg3=0,sum2=0,sum1=0;
		System.out.println("Enter the name of student1");
		String s1=sc.nextLine();
		System.out.println("Enter the name of student2");
		String s2=sc.next();
		System.out.println("Enter the subject number of student 1");
			int a1[]=new int[3];
		for(int i=0;i<3;i++)
		{
			a1[i]=sc.nextInt();
			if(a1[i]<0)
				throw new NegativeValueException("Value is negative");
			if(a1[i]>100)
				throw new OutOfRangeException("Value is out of range");
		}
		System.out.println("Enter the subject number of student 2");
		int a2[]=new int[3];
		for(int i=0;i<3;i++)
		{
			a2[i]=sc.nextInt();
			if(a2[i]<0)
				throw new NegativeValueException("Value is negative");
			if(a2[i]>100)
				throw new OutOfRangeException("Value is out of range");
		}try {
			for(int i=0;i<a1.length;i++) {
				sum1=sum1+a1[i];
			}
			avg1=sum1/3;
			System.out.println("AverageMarks of student 1: "+avg1);
			for(int i=0;i<a2.length;i++) {
				sum2=sum2+a2[i];
			}
			avg2=sum2/3;
			System.out.println("AverageMarks of student 2 "+avg2);
			avg3=(avg1+avg2)/2;
			System.out.println("Average of two student is:"+avg3);
			
		}
		catch(NumberFormatException e)
		{
         	System.out.println(e);
		}
	}

}
