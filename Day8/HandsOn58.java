package Day8;
import java.util.HashSet;
/*Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and
returns the country if exist else return null.*/
//NOTE: You can test the methods using a main method.
import java.util.Iterator;
import java.util.Set;
class Country
{
	HashSet <String> H1=new HashSet<>();
	HashSet<String> saveCountryNames(String CountryName)
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
public class HandsOn58 {

	public static void main(String[] args) {
		Country count=new Country();
		count.saveCountryNames("India");
		count.saveCountryNames("Africa");
		count.saveCountryNames("Australia");
		count.saveCountryNames("England");
	
		System.out.println(count.getCountry("China"));
		System.out.println(count.getCountry("Africa"));

	}

}
