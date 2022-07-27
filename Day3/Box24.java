package Day3;
//Create a class Box that uses a parameterized constructor to initialize the dimensions of a 
//box.The dimensions of the Box are width, height, depth. The class should have a method
//that can return the volume of the box. Create an object of the Box class and test the functionalities.


public class Box24 {

	double width, height, depth;
	Box24(int a,int b,int c)
	{
		width=a;
		height=b;
		depth=c;
	}
	double vol()
	{
	    return width*height*depth;
	   // System.out.println(d);
	}
	
	public static void main(String[] args) {
		Box24 obj=new Box24(5,6,7);
		System.out.println("Volume is: "+obj.vol());
	}

}
