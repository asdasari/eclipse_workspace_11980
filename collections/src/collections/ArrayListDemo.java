package collections;

import java.util.ArrayList;

/*
ArrayList:
---------
Maintain insertion order
Duplicates are allowed
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		System.out.println(al);

		al.add(100);
		al.add(100);
		System.out.println(al.size());
		System.out.println(al);
		
		al.add("Java");
		al.add("Java");
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(2, "Angular");
		System.out.println(al.size());
		System.out.println(al);

		al.set(0, 1000);//Updating
		System.out.println(al.size());
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al.size());
		System.out.println(al);

		System.out.println(al.get(0));
		//System.out.println(al.get(5));
		System.out.println(al.get(al.size()-1));
		
		al.clear();//remove all elements
		System.out.println(al.size());
		System.out.println(al);
	}
}
