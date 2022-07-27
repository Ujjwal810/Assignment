package Day8;
import java.util.Iterator;
import java.util.TreeSet;

public class HandsOn61 {

	public static void main(String[] args) {
		TreeSet <String> treeset=new TreeSet<>();
		treeset.add("Rajesh");
		treeset.add("Suresh");
		treeset.add("Mukesh");
		treeset.add("Vimlesh");
		System.out.println("TreeSet....\n"+treeset);
		System.out.println("Reverse TreeSet....\n"+treeset.descendingSet());
		printall(treeset);
	    System.out.println("Does name Mukesh exist in the TreeSet ? " + treeset.contains("Mukesh"));
	}

	private static void printall(TreeSet<String> treeset) {
		System.out.println("Iterate element");
		Iterator <String> it=treeset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
