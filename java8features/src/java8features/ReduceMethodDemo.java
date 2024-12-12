package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethodDemo {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000,40000,20000,30000,60000);
		System.out.println(salaries);
		
		BinaryOperator<Integer> binOper = (sal1, sal2) -> sal1+sal2;
				
		int total = salaries.stream()
			.reduce(binOper)
			.get();
		System.out.println(total);
		
		System.out.println("---------------------");
		
		int sum = salaries.stream()
			.reduce((sal1, sal2) -> sal1 + sal2)
			.get();
		System.out.println(sum);
		
		System.out.println("-----------------------");
		
		int totalSalary = salaries.stream()
							.mapToInt((salary) -> salary)
							.sum();
		System.out.println(totalSalary);
		
		
	}
}
