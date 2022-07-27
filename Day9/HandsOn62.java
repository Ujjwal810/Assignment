package Day9;

/*Create a Collection called HashMap which is capable of storing String objects.
 The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HandsOn62 {

	public static void main(String[] args) {
		HashMap <String,String> map=new HashMap<>();
		map.put("India","Delhi");
		map.put("South Africa","Cape Town");
		map.put("Japan","Tokyo");
		boolean flag=map.containsKey("India");
		System.out.println("India is present:"+flag);
		boolean flag1=map.containsValue("Tokyo");
		System.out.println("Tokyo is present:"+flag1);
		Set<Entry<String, String>> set = map.entrySet();//Create a new set and store the map element into them
        Iterator<Entry<String,String>> it=set.iterator();
        while(it.hasNext())
        {
        	Map.Entry<String,String> me=it.next();
        	System.out.println(me); 	
        }

	}

}
