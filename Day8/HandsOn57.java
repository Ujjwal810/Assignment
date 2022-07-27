package Day8;
//Write a program that will have a Vector which is capable of storing Employee objects. 
//Use an Iterator and enumeration to list all the elements of the Vector.

import java.util.Vector;
import java.util.Iterator;

class  Emp
{
	int id;
	String name;
	double salary;
	Emp(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return "Employee [id="+id+",name="+name+",salary="+salary+"]";
	}
}
public class HandsOn57 {

	public static void main(String[] args) {
		Vector<Emp> list=new Vector<>();
		list.add(new Emp(101,"Vibhay",24500));
		list.add(new Emp(105,"Vinay",29500));
		list.add(new Emp(110,"Ajay",40250));
		Iterator <Emp> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
