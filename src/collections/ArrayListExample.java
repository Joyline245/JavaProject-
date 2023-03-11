package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "John", "Smith", "Leena", "Priya" };

		System.out.println("The second name is " + names[3]);

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Priya");
		list1.add("Smith");
		list1.add("Leena");
		list1.add("John");
		// list1.add(null); //list will not allow null values 
		list1.add("John");
		
		System.out.println("The list is " + list1);
		System.out.println("The size of the list is " + list1.size());
		System.out.println("First name in the list is " + list1.get(0));
		System.out.println("Last name in the list is " + list1.get(list1.size() - 1));

		System.out.println("The list before updating Smith" + list1);

		list1.set(1, "Andrew"); // To Update the data at index
		System.out.println("The list after updating Smith" + list1);

		list1.remove(2);
		System.out.println("The list after deleting Leena" + list1);

		// iterate through the list
		// Method 1
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("The name is " + list1.get(i));
		}

		System.out.println("-------");

		// Method 2
		for (String value : list1) {
			System.out.println("Element value " + value);
		}

		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// To sort
		Collections.sort(list1);
		System.out.println("After sorting the list " + list1);

		System.out.println("-----------------------");

		// To Reverse list

		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("Reverse method list " + list1);

		
		
	}

}
