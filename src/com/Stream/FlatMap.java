package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		List<String> team1 = Arrays.asList("SCOTT","David","John");
		List<String> team2 = Arrays.asList("Marry","Luna","Tom");
		List<String> team3 = Arrays.asList("Kitty","kane","Jon");
		
		
		List<List<String>> finalTeam = new ArrayList<>();
				
				finalTeam.add(team1);
				finalTeam.add(team2);
				finalTeam.add(team3);
				System.out.println(finalTeam);
				List<String> teamL =finalTeam.stream().flatMap(t -> t.stream()).collect(Collectors.toList());
				
				System.out.println(teamL);
				
	}
}

