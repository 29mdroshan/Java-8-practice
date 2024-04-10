package com.hm.function;

import java.util.function.Function;

public class FunctionChaning {
	public static void main(String[] args) {
		Function<String, String> f1 = i -> i.toUpperCase();

		Function<String, String> f2 = i -> i.substring(0, 9);

		String str = "Vidyavardhaka College of Engineering";
		System.out.println(f1.compose(f2).apply(str));

		System.out.println(f1.andThen(f2).apply(str));

		Function<Integer,Integer> f3 = i -> i+i;

		Function<Integer,Integer> f4 = i -> i*i*i;
		
		System.out.println(f3.compose(f4).apply(3));

		System.out.println(f4.andThen(f3).apply(3));
	}

}
