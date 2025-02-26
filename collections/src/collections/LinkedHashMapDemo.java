package collections;

import java.util.LinkedHashMap;
import java.util.Map;

/*
LinkedHashMap:
1. To store key and value pair
2. Insertion order maintain based on based keys.

*/
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
		hm.put("JFS", 400);
		hm.put("PFS", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		System.out.println(hm);
		
		hm.put("JFS", 500);
		System.out.println(hm);

		hm.put(null, 100);
		System.out.println(hm);
		
		hm.put("Angular", null);
		System.out.println(hm);

		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry);
		}
		
	}
}
