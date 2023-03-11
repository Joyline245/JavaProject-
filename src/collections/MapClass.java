package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> basket = new HashMap<String,Integer>();
		basket.put("Item1", 1);
		basket.put("Item2", 5);
		basket.put("Item3", 2);
		basket.put("Item4", 2);
		
		System.out.println("The Map is "+basket);
		
		
		basket.put("Item3", 4);  // It'll update and here the key is unique and value can duplicate 
		
		System.out.println("The map after change is" +basket);
	
		basket.remove("Item2");
		System.out.println("The Map after delete is" +basket);
		
		//basket.put("Item5", null);
		//System.out.println("The Map after adding null is" +basket);
	
		//basket.put(null, 4);
		//System.out.println("The Map after adding null as key" +basket);
	
		
		//Iterate Through key set 
		for(String item:basket.keySet()) {
			System.out.println("The key is " +item);
			System.out.println("The Qunatity is "+basket.get(item));
		}
		
		
		//Iterate through value 
		for(Integer val:basket.values()) {
			System.out.println("The value is "+val);
		}
		

		String str = "Clean World Green World Happy World";
		
		String[] arr1 = str.split(" ");
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(String word:arr1) {	
			if(!map1.keySet().contains(word)) {
				map1.put(word, 1);
			}else {	
				map1.put(word, map1.get(word)+1);
			}
		}
		
		System.out.println("The resulting map  is " + map1);

		
		
		
		
		
		
	}

}
