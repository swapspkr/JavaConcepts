package com.Stream;

import java.util.Arrays;
import java.util.List;

class Student{
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	Student(String name,int score){
			
		this.name=name;
		this.score=score;
	}
}

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<Student> studlist = Arrays.asList(
				
				new Student("John",88),
				new Student("Matthew",68),
				new Student("Cody",97),
				new Student("Jerry",89),
				new Student("Mary",87)
				);
		//using stream
		//studlist.stream().filter(stud -> stud.getScore()>80).forEach(s -> System.out.println(s.getName()+" "+s.getScore()));
			
		//using parallel stream
		studlist.parallelStream().filter(stud -> stud.getScore()>80).forEach(s -> System.out.println(s.getName()+" "+s.getScore()));
		// convert stream to parallel stream
		//studlist.stream().parallel().filter(stud -> stud.getScore()>80).limit(3).forEach(s -> System.out.println(s.getName()+" "+s.getScore()));
		
	}

}
