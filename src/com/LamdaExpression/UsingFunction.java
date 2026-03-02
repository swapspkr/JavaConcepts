package com.LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsingFunction {

	public static void main(String[] args) {
		// Function<T,R> - 2 argument is passed to function T -> perform operation on R
		// -> return type

		/*
		 * // suppose we want to find length of string and return length
		 * 
		 * Function<String,Integer> fn = s->s.length();
		 * 
		 * System.out.println(fn.apply("JavaProgramming"));
		 * System.out.println(fn.apply("Welcome"));
		 */

		// If employee salary is between 10000 -20000 give 10% bonus

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Scott", 40000, 4));
		empList.add(new Employee("David", 50000, 5));
		empList.add(new Employee("John", 20000, 2));

		Function<Employee, Integer> em = e -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 20000)
				return (sal * 10 / 100);
			else if (sal >= 20000 && sal <= 30000)
				return (sal * 20 / 100);
			else if (sal >= 30000 && sal <= 50000)
				return (sal * 30 / 100);
			return (sal * 40 / 100);
		};

		// check if bonus is greater than 5000 then print emp details and bonus

		Predicate<Integer> bn = b -> b > 5000;

		for (Employee emp : empList) {

			int bonus = em.apply(emp);
			if (bn.test(bonus)) {
				System.out.println(emp.ename + " " + emp.salary);
				System.out.println("Bonus: " + bonus);
			}
		}

	}

}
