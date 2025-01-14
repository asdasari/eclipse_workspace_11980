package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeLineDemo {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000,40000,20000,30000,60000);
		System.out.println(salaries);
		
		/*
		Task-1:
		Filter the salaries which are >= 50000	
		Increment the filtered salaries by 10% 	
		Find the total of filtered and incremented salaries 
		Expected Output: 121000
		*/		
		
		double totalSalary = salaries.stream()//Source
				.filter((salary) -> salary >= 50000)//Intermediate Operation-1
				.map((salary) -> salary + salary * .1)//Intermediate Operation-2
				.mapToDouble(salary -> salary)//Intermediate Operation-3
				.sum();						//Terminal Operation
		
		System.out.println(totalSalary);
		
		
		/*
		Task-2:
		Filter the salaries which are <= 50000	
		Sort the filtered salaries in Descending order
		Expected Output: [50000, 40000, 30000, 20000]
		*/	
		
		List<Integer> incrementedSalaries = salaries.stream()//Source
				.filter((salary) -> salary <= 50000)//Intermediate Operation-1
				.sorted(Comparator.reverseOrder())//Intermediate Operation-2
				.toList();						  //Terminal Operation
		
		System.out.println(incrementedSalaries);
		
		
		/*
		Task 3:
		Input: [1,3,2,4,3,1,2] 
		Output:[4,3,2,1]
		*/
		
		List<Integer> nums = Arrays.asList(1,3,2,4,3,1,2);

		List<Integer> uniqueNums = nums.stream()
			.distinct()
			.sorted(Comparator.reverseOrder())
			.toList();
		System.out.println(uniqueNums);
		
		/*
		Task 4:
		Input: JAVA 
		Output: J A V A
		*/
		
		
        /*
		Task 5:
		Input: ["ja va", "py thon", "an gu lar"] 
		Output: ["JAVA","PYTHON","ANGULAR"]
		*/

	}
}
