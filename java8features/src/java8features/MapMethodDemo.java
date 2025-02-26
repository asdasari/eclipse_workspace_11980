package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapMethodDemo {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000,40000,20000,30000,60000);
		System.out.println(salaries);
		
		List<Integer> incrementedSalaries = new ArrayList<>();
		//60000,50000,30000,40000,70000
		
		Function<Integer, Integer> fun = (salary) -> salary + 5000;
		
		incrementedSalaries = salaries.stream()
										.map(fun)
										.toList();
		
		System.out.println(incrementedSalaries);
		
		//increment each salary by 10%
		List<Double> incrSalaries = salaries.stream()
										.map((salary) -> salary + salary * .1)
										.toList();
		System.out.println(incrSalaries);
		
	}
}
