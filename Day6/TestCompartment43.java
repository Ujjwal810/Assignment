package Day6;
/* Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.
Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
*/
abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{   
	public String notice()
	{
       return "This is First Class";
	}	
}
class Ladies extends Compartment
{   
	public String notice()
	{
       return "This is Ladies Class";
	}	
}
class General extends Compartment
{   
	public String notice()
	{
       return "This is General Class";
	}
}
class Luggage extends Compartment
{   
	public String notice()
	{
       return "This is Luggage Class";
	}	
}
public class TestCompartment43 {

	public static void main(String[] args) {
		Compartment a[]=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			double b=Math.random()*4;//Generate Random number
			int x=(int)b;
		if(x==0)
			a[i]=new FirstClass();
		else if(x==1)
			a[i]=new Ladies();
		else if(x==2)
			a[i]=new General();
		else 
			a[i]=new Luggage();
		System.out.println(a[i].notice());
		}
	}

}
