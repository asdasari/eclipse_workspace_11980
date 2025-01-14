package collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55,44,88,99,55,66);
		System.out.println(list);
		
		//[55, 44, 88, 99, 55, 66]
		//filter only even numbers
		
		System.out.println("Using for each loop");
		for(int element : list) {
			if(element%2 == 0) {
				System.out.println(element);
			}
		}
		
		System.out.println("Using forEach() method");
		
		list.forEach((element) -> {
			if(element%2 == 0) {
				System.out.println(element);
			}
		});
		
		System.out.println("Using filter() method using Stream API");

		Predicate<Integer> predicate = (element) -> element%2 == 0;	
		
		list.stream()
			.filter(predicate)
			.forEach(System.out :: println);
		
		System.out.println("Using filter() method using Stream API");
	
		list.stream()
			.filter((element) -> element%2 == 0)
			.forEach(System.out :: println);
		
		
		
	}
}
