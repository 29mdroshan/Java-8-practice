package com.hm.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,5,6,7,8,9);
		
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		System.out.println("__________");
		list.stream().map(i->i*i).forEach(System.out::println);
		System.out.println("__________");
		int mini=list.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("Minimum value is: "+mini);
		System.out.println(list.stream().sorted().findFirst());
		
		int maxi=list.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Maximum value is: "+maxi);
		System.out.println("__________");
		System.out.println("converting stream into an array");
		Integer arr[]=list.stream().toArray(Integer[]::new);
		for(int i:arr) {
			System.out.print(i+", ");
		}
		System.out.println();
		System.out.println("converting array to stream");
		Stream<Integer> st=Stream.of(arr);
		st.forEach(System.out::print);
		
		System.out.println("__________");
		List<String> list2=Arrays.asList("Roshan","Ahmed","bob","don","Yashu","ab");
		list2.stream().filter(i->i.length()>3).forEach(System.out::println);
		int count=(int) list2.stream().filter(i->i.length()>3).count();
		System.out.println("__________");
		list2.stream().map(i->i.toUpperCase()).forEach(System.out::println);
		System.out.println("__________");
		list2.stream().sorted().forEach(System.out::println);
		System.out.println("__________");
		list2.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		
		
		
		
		
	}

}
