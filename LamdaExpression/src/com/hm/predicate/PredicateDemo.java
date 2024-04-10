package com.hm.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;//boolean valued function
		System.out.println(p.test(50));
		
		
		Predicate<String> p2=i->i.length()>4;
		List<String> list2=Arrays.asList("Roshan","Ahmed","bob","adon","Yashu","ab");
		list2.forEach(i->System.out.println(p2.test(i)));
		System.out.println("_________________");
		Predicate<Collection> p3=i->i.isEmpty();
		List<Object> list=new ArrayList<>();
		System.out.println(p3.test(list));
		System.out.println(p3.test(list2));
		
		System.out.println("**********");
		Predicate<String> p4=i->i.toLowerCase().startsWith("a");
		list2.forEach(i->System.out.println(p4.test(i)));
		
		
		System.out.println("**********");
		System.out.println("Program to check string is not null or empty");
		List<String> list3=Arrays.asList("Roshan",null," ","Ahmed",null,"");
		Predicate<String> p5=i->i!=null && !i.isBlank();
		list3.forEach(i->System.out.println(p5.test(i)));
		
		
	}
}
