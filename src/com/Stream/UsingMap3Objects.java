package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.LamdaExpression.Employee;

public class UsingMap3Objects {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("Scott", 40000, 4),
				new Employee("David", 50000, 5),
				new Employee("John", 20000, 2)
				);
		
		List<Integer> mList = new ArrayList<>();
		
		mList = empList.stream().filter(e -> e.salary>20000)
						.map(map ->map.salary).collect(Collectors.toList());
		System.out.println(mList);
		
	}

}
