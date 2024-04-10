package com.practiceproject.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		Set<Integer> hashset=new LinkedHashSet<>();
		
		hashset.add(1);
		hashset.add(2);
		hashset.add(1);
		hashset.add(8);
		hashset.add(9);
		hashset.add(5);
		hashset.add(1);
		
		
		hashset.forEach(i->System.out.println(i));
		
		System.out.println("Tree Set");
		Set<Integer> treeset=new TreeSet<>(List.of(1,2,3,1,4,7,5,9,6,3));
		treeset.forEach(i->System.out.println(i));
		
		
		
	}
}
