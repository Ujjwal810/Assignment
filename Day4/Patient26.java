package Day4;
// Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),width(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).
//Create an object of the Patient class and check the results.
import java.util.Scanner;
public class Patient26 {
      double x,y;
      double BMI(double c,double d)
      {
    	  x=c;
    	  y=d;
    	  double z=x/(y*y);
    	  return z;
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient name:");
        String s=sc.next();
        System.out.println("Enter Patient height in meter:");
        double a=sc.nextDouble();
        System.out.println("Enter Patient weight in kg:");
        double b=sc.nextDouble();
        Patient26 obj=new Patient26();
        System.out.println("The BMI of "+s+" is: "+obj.BMI(a,b));  
	}

}
