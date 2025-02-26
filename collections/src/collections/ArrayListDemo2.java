package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//Normal ArrayList
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add("Java");
		al.add("Python");
		al.add(45000.0);
		al.add(35000.0);
		System.out.println(al);
		
		Object obj = al.get(0);
		int x = (int) obj;
		System.out.println(x);
		
		//Generic Version ArrayList-Type Safety & Avoids type casting
		ArrayList<Integer> subjectMarks = new ArrayList<>();
		subjectMarks.add(44);
		subjectMarks.add(55);
		subjectMarks.add(66);
		subjectMarks.add(77);
		subjectMarks.add(88);
		subjectMarks.add(99);
		//subjectMarks.add("Java");
		System.out.println(subjectMarks);
		
		int s1 = subjectMarks.get(0);
		System.out.println(s1);
		
		//Create an array list with a group of course names
		//Java, Python, Angular, ReactJS, JS
	}
}
