package zohoFirst;

import java.util.LinkedHashMap;

public class LinkedHashMap_ {
	public static void main(String[]args) {
		LinkedHashMap<String, Integer>numbers= new LinkedHashMap<>(8,0.6f,true);
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("eigth", 8);
		numbers.put("nine", 9);
		numbers.put("seven", 7);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		System.out.println("Before : "+numbers);
	}
	

}
