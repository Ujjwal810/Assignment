package Day9;
/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HandsOn64 {

	public static void main(String[] args) {
		HashMap <String,Integer> cl=new HashMap<>();
		cl.put("Vibhay",987559);
		cl.put(" Raj",686787);
		cl.put("Kamal",8790098);
		boolean flag=cl.containsKey("Raj");
		System.out.println("Raj is present:"+flag);
		boolean flag1=cl.containsValue(687799);
		System.out.println("Number:687799 is present:"+flag1);
		Set<Entry<String, Integer>> set = cl.entrySet();//Create a new set and store the map element into them
        Iterator<Entry<String,Integer>> it=set.iterator();
        while(it.hasNext())
        {
        	Map.Entry<String,Integer> me=it.next();
        	System.out.println(me); 	
        }

	}

}