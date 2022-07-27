package Day3;
//Create a new class called Calculator with the following methods:
//1. A static method called powerInt(int num1,int num2)
//This method should return num1 to the power num2.
//2. A static method called powerDouble(double num1,int num2).
//This method should return num1 to the power num2.
//3. Invoke both the methods and test the functionalities.
//Hint: Use Math.pow(double,double) to calculate the power.

public class Calculator25 {
	    static double x,y;
        static int powerInt(int num1,int num2)
        {
        	x=num1;
        	y=num2;
        	int a=(int)Math.pow(num1,num2);
        	return a;
        }
        static int powerDouble(double num1,int num2)
        {
        	x=num1;
        	y=num2;
        	int a=(int)Math.pow(num1,num2);
        	return a;
        }
	public static void main(String[] args) {
		Calculator25 obj=new Calculator25();
        //obj.powerInt(5, 2);
        //obj.powerDouble(7.5,3);
        System.out.println("Power1 is: "+obj.powerInt(5, 2));
        System.out.println("Power2 is: "+obj.powerDouble(7.5, 3));
	}

}
