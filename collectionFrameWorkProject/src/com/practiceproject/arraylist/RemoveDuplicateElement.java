package com.practiceproject.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		
		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(1,2,3,1,4,2,3,5,4,5,6,4,7,8,9,5));
		
		
		//1.Linked hashset
		LinkedHashSet<Integer> linkedhashset= new LinkedHashSet<Integer>(number);
		ArrayList<Integer> withouthduplicate =new ArrayList<>(linkedhashset);
		withouthduplicate.forEach(i->System.out.println(i));
		
		//2. stream Api
		List<Integer> number2=number.stream().distinct().collect(Collectors.toList());
		number2.forEach(i->System.out.println(i));

	}

}
