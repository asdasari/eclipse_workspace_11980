package collections;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet:
1. Maintain ordered sequence of elements
2. Duplicates are not allowed.
*/
public class TreeSetDemo {
	public static void main(String[] args) {
		//TreeSet<Integer> hs = new TreeSet<>();
		TreeSet<Integer> hs = new TreeSet<>(Comparator.reverseOrder());
		hs.add(100);
		hs.add(300);
		hs.add(400);
		hs.add(200);
		hs.add(500);
		System.out.println(hs);	

		//TreeSet<String> ts = new TreeSet<>();
		TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());
		ts.add("Java");
		ts.add("Angular");
		ts.add("Python");
		ts.add("React");
		System.out.println(ts);
		
		//Traversal
		for(String course : ts) {
			System.out.println(course);
		}
		
		for(int price : hs) {
			System.out.println(price);
		}
	}
}
