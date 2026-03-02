package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{

	String name;
	int id;
	char grade;
	
	Student(String name,int id,char grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	
}


public class FlatMapDemo2 {

	public static void main(String[] args) {
		
		
		List<Student>  studList1 = new ArrayList<Student>();
		studList1.add(new Student("Smith",101,'A'));
		studList1.add(new Student("John",102,'B'));
		studList1.add(new Student("Kenny",103,'C'));
		
		List<Student>  studList2 = new ArrayList<Student>();
		studList1.add(new Student("Scott",104,'A'));
		studList1.add(new Student("Mary",105,'B'));
		studList1.add(new Student("Ketty",106,'C'));
		
		
		List<List<Student>> studListA = new ArrayList<List<Student>>();
		studListA.add(studList2);
		studListA.add(studList1);
		
		List<String> teamL =studListA.stream().flatMap(t -> t.stream().map(n->n.name)).collect(Collectors.toList());
		
		System.out.println(teamL);
		
		
		
		
	}
}

