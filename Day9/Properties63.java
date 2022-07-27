package Day9;
/*Write a program that will have a Properties class object which is capable of storing some States of India
and their Capital. Use an Iterator to list all the elements stored in the Properties.*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Properties63
{
	HashMap<String,String> map=new HashMap<>();
	void properties(String state,String Capital )
	{
		map.put(state, Capital);
	}
	public String toString()
	{
		return "Properties ["+map+"]";
	}
	public void AllProperties() {
		System.out.println("Properties.....");
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
		}
	}
	public static void main(String[] args) {
		Properties63 prop=new Properties63();
		prop.properties("UP","Lucknow");
		prop.properties("Bihar","Patna");
		prop.properties("MP","Bhopal");
		prop.AllProperties();
		

	}
	
}
