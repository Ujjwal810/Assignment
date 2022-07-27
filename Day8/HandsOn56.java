package Day8;
//Write a Java program to create an Vector, add all the months of a year and print the same.

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class HandsOn56 {

	public static void main(String[] args) {
		Vector<String> list=new Vector<>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		printall(list);
	}
	private static void printall(Vector<String> list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
