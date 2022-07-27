package Day4;
//Create a class named ‘Animal’ which includes methods like eat() and sleep().
//Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
//Create an instance of Animal class and invoke the eat and sleep methods using this object.
//Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
abstract class Animal
{
	abstract void eat();
	abstract void sleep();
}
 class Bird extends Animal
{
	void eat()
	{
		System.out.println("Birds eat insects");
	}
	void sleep() {
		System.out.println("Birds sleep on the tree");
	}
	void fly()
	{
		System.out.println("Birds fly in the sky");
	}
}
public class HandsOn27 {

	public static void main(String[] args) {
		Bird obj=new Bird();
		obj.eat();
		obj.sleep();
		obj.fly();

	}

}
