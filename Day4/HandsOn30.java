package Day4;
class fruit
{
	String name,taste,size;
	void eat()
	{
		System.out.println("Fruit eating...");
	}
}
class Apple extends fruit
{
	Apple()
	{
	   name="Apple";
	   taste="sweet";
	   size="small";
	}
	   void eat()
	   {
		   System.out.println(name+" is a "+taste+" in taste and size is "+size);
	   }
}
class Orange extends fruit
{
	Orange()
	{
	   name="Orange";
	   taste="sweet and sour";
	   size="small";
	}
	   void eat()
	   {
		   System.out.println(name+" is a "+taste+" in taste and size is "+size);
	   }
}
public class HandsOn30 {

	public static void main(String[] args) {
		fruit a=new fruit();
		Apple b=new Apple();
		Orange c=new Orange();
        a.eat();
        b.eat();
        c.eat();
	}

}
