package Day8;
//Write a program to store a group of employee names into a HashSet, 
//retrieve the elements one by one using an Iterator
import java.util.HashSet;
import java.util.Iterator;
public class HandsOn59 {

	public static void main(String[] args) {
		HashSet <String> list=new HashSet<>();
		list.add("Rajesh");
		list.add("Suresh");
		list.add("Mukesh");
		list.add("Vimlesh");
		printall(list);
	}

		private static void printall(HashSet<String> list) {
			System.out.println("Employee Name........");
			Iterator<String> it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	}

}
