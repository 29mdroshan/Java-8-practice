package com.hm.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoining {
	public static void main(String[] args) {
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
		List<Integer> list=Arrays.asList(6,7,8,9,12,34,35,65,70);
		
//		list.forEach(i->System.out.println(p2.test(i)));
//		
//		list.forEach(i->System.out.println(p2.test(i)));
		
		//number graeter than 10 and even
		
		list.forEach(i->System.out.println(p1.and(p2).test(i)));
		
		System.out.println("_______");
		list.forEach(i->System.out.println(p1.or(p2).test(i)));
		
		System.out.println("_______");
		list.forEach(i->System.out.println(p1.negate().test(i)));
		

	}

}
