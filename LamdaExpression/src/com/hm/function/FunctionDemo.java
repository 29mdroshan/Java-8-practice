package com.hm.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f=i->i.length();

		System.out.println(f.apply("roshan"));
		
		Function<Integer, Integer> f2=i->i*i;

		System.out.println(f2.apply(5));
		
		System.out.println("Program to remove spacess from string");
		String str="Hello Roshan how are yoy ?";
		Function<String,String> f3=i->i.replaceAll(" ", "");
		System.out.println(f3.apply(str));
		
		
		System.out.println("Program to countspacess in string");
		Function<String,Integer> f4=i->i.length()-i.replaceAll(" ", "").length();
		System.out.println(f4.apply(str));
		
	}

}
