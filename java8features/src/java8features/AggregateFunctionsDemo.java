package java8features;

import java.util.Arrays;
import java.util.List;

public class AggregateFunctionsDemo {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000, 40000, 20000, 30000, 60000);
		System.out.println(salaries);

		System.out.println("-------Sum Salary---------------");

		int totalSalary = salaries.stream()
					.mapToInt((salary) -> salary)
					.sum();
		System.out.println(totalSalary);
		
		System.out.println("-------Max Salary--------------");
		int max = salaries.stream()
							.mapToInt((salary) -> salary)
							.max()
							.getAsInt();
		System.out.println(max);
		
		System.out.println("-------Min Salary---------------");
		int min = salaries.stream()
				.mapToInt((salary) -> salary)
				.min()
				.getAsInt();
		System.out.println(min);
		
		System.out.println("-------Average Salary--------------");
		double avg = salaries.stream()
				.mapToInt((salary) -> salary)
				.average()
				.getAsDouble();				
		System.out.println(avg);
	}
}
