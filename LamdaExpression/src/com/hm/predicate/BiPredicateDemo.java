package com.hm.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> bp1=(a,b)->(a+b)%2==0;
		System.out.println(bp1.test(10, 20));
	}

}
