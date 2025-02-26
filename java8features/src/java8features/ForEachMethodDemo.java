package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55,44,88,99,55,66);
		
		System.out.println("Using for each loop");
		for(int x : list) {
			System.out.println(x);
		}
		
		System.out.println("Using forEach() method with lambda expression from Java 8v");
		Consumer<Integer> consumer = (element) -> System.out.println(element);		
		list.forEach(consumer);
				
		System.out.println("Using forEach() method with Method References from Java 8v");
		Consumer<Integer> consumer2 = System.out :: println;		
		list.forEach(consumer2);
		
		System.out.println("Using forEach() method with lambda expression from Java 8v");
		list.forEach((element) -> System.out.println(element));
		
		System.out.println("Using forEach() method with Method References from Java 8v");
		list.forEach(System.out :: println);
		
		System.out.println(list);
		//[55, 44, 88, 99, 55, 66]
		//filter only even numbers
		
		for(int element : list) {
			if(element%2 == 0) {
				System.out.println(element);
			}
		}
		
		System.out.println("--------------");
		
		list.forEach((element) -> {
			if(element%2 == 0) {
				System.out.println(element);
			}
		});
	}
}
