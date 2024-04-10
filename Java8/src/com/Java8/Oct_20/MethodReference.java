package com.Java8.Oct_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> items=Arrays.asList(10,2,25,15,5);
		items.forEach(i-> System.out.println(i));
		System.out.println();
		items.forEach(System.out::println);
		
		List<String> names=Arrays.asList("roshan","ahamed","apple");
		//names.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		//Method Reference
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
