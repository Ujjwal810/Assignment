/*Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products
whose cost is less than 20000 and print the details of products in the list whose cost is greater than 20000
Step1: Create an Electronic Product bean class with attributes id , name and price
Step2: create a main method and add list of products created to product list
Step3: create a stream object and filter the list using stream filter and lambda expression
Step4: Using lambda expression iterate through list to print product name and product price
Sample output
Iphone 6S: 65000.0
Sony Xperia: 25000.0
Redmi4 : 26000.0*/

package Day11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Pro {
	int id;
	String name;
	float price;

	Pro(int id, String name, Float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
}

public class LambdaExpressionFilter {
	public static void main(String[] args)
   {
	ArrayList<Pro> list=new ArrayList<>();
	list.add(new Pro(1,"Sony Experia",25000f));
	list.add(new Pro(2,"Redmi4",26000f));
	list.add(new Pro(3,"Iphone 6S",65000f));
	//With Stream
	Stream<Pro> productupdatelist=list.stream().filter(p->p.price>20000);
	productupdatelist.forEach(product->System.out.println(product.name+": "+product.price));
	
	//With map
	/*Map<Object, Object> list1=list.stream()
			.filter(p->p.price>20000)
			.collect(Collectors.toMap(p->p.getName(),p->p.getPrice()));
	list1.forEach((name,price)->System.out.println(name+": "+price));*/
   }
}
