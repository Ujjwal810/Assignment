package Day8;
//Create an ArrayList that can store only Strings.
//Create a printAll method that will print all the elements of the ArrayList using an Iterator.

import java.util.ArrayList;
import java.util.Iterator;


public class HandsOn53 {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Forth");
		printall(list);
	}

	private static void printall(ArrayList<String> list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}