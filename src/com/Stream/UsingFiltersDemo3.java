package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UsingFiltersDemo3 {

	public static void main(String[] args) {
		
		// filter the collection : filter null values from collections
		
		List<Product> prodList = new ArrayList<>();
		
		prodList.add(new Product(1,"HP laptop",25000));
		prodList.add(new Product(2,"Dell laptop",30000));
		prodList.add(new Product(3,"Lenovo laptop",28000));
		prodList.add(new Product(4,"Sony laptop",23000));
		prodList.add(new Product(5,"Apple laptop",90000));
		
		prodList.stream()
						  .filter(p->p.price>25000)  // filtering
						 .forEach(pr -> System.out.println(pr.price));  //iterating
	}

}
