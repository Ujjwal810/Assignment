package Day8;
//Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.

import java.util.ArrayList;
import java.util.List;

class MyArrayList<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}

public class HandsOn54 {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(56);
			list.add(8.2F);
			list.add(3.14678);
			list.add("Test");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);

	}

}