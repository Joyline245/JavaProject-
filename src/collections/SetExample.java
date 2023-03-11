package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Jake");
		set1.add("Lily");
		set1.add("Naina");
		//set1.add(null);
		
		System.out.println("The set is "+set1);
		
		System.out.println("---------------------------");
		
		TreeSet<String> set2 =new TreeSet<String>();
		set2.add("Zen");
		set2.add("Joy");
		set2.add("Kale");
		set2.add("Kale");//It wont accept duplicate value
		System.out.println("The output is "+set2);
		
		
		//Covert Set to List
		ArrayList<String> list1 = new ArrayList<String>(set1);
		System.out.println(list1);
	}

}
