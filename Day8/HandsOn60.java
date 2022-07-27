package Day8;
/*Develop a java class with a instance variable H1 (TreeSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a TreeSet (H1) and return the added TreeSet(H1).
Develop a method getCountry(String CountryName) which iterates through the TreeSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method.*/



import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
class C
{
	TreeSet <String> H1=new TreeSet<>();
	TreeSet<String> saveCountryNames(String CountryName)
	{
		H1.add(CountryName);
		return H1;
	}
	String getCountry(String Countryname)
	{
		Iterator<String> it=H1.iterator();
		while(it.hasNext())
		{
			if(it.next().equals(Countryname))
			{
				return Countryname;
			}
		}
		return null;
	}
}
public class HandsOn60 {

	public static void main(String[] args) {
		C count=new C();
		count.saveCountryNames("India");
		count.saveCountryNames("Africa");
		count.saveCountryNames("Australia");
		count.saveCountryNames("England");
	
		System.out.println(count.getCountry("China"));
		System.out.println(count.getCountry("Africa"));

	}

}