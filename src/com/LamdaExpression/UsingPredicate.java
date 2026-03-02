package com.LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UsingPredicate {

	public static void main(String[] args) {
		/*
		// Ex 1 :  check if length of String in array String 
		Predicate<String> str = p -> (p.length()>4) ;
		//System.out.println(str.test("Swapnil"));

		String[] arr = {"David","Scott","Smith","John","Mary"};
		
		for(String s : arr ) {
			
			if(str.test(s)) {
				System.out.println(s);
			}
		}
		*/
		/*
		// Ex: 2  to get employee having salary > 30000 and exp > 3 
		
		//Employee emp = new Employee("David", 20000, 2);
		
		Predicate<Employee> pr = e-> (e.salary>30000 && e.experience>3);
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Scott", 40000, 4));
		empList.add(new Employee("David", 50000, 5));
		empList.add(new Employee("John", 20000,2));
		
		
		for(Employee e : empList) {
			
			if(pr.test(e)) {
				System.out.println(e.ename);
			}
		}
		
		*/
		
		//Ex: Joining predicate - and / or 
		
		// p1 - check number is even
		// p2 - check number is greater than 50
		
		int a[] = {5,15,10,6,7,25,30,40,50,55,60,78};
		
		Predicate<Integer> p1 = n -> n%2==0;
		Predicate<Integer> p2 = n -> n>50;
		
		System.out.println("Below numbers are Even and greater than 50.");
		for(int num : a) {
			
			if(p1.and(p2).test(num)) {
				System.out.print(" "+num);
			}
		}
		
		
	}

}
