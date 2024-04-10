package com.Java8.Oct_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMethods {
	public static List<Integer> getEven(List<Integer> list){
		List<Integer> even= new ArrayList();
		list.forEach(i->{
			if(i%2==0) {
				even.add(i);
			}
		});
		return even;	
		
	}
	public static List<Integer> getDoubles(List<Integer> list){
		List<Integer> doubles= new ArrayList();
		list.forEach(i->{
			doubles.add(i*2);
		});
		return doubles;	
		
	}
	
	public static int getSum(List<Integer> list) {
		int sum=0;
		for(int n:list) {
			sum+=n;
		}
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,3,7,6,1,2);
//		List<Integer> evens =getEven(list);
//		List<Integer> doubles=getDoubles(evens);
//		int sum =getSum(doubles);
//		System.out.println(sum);
		
//		int sum=list.stream().filter(i->i%2==0).map(i->i*2).reduce((i,s)->s+i)
//		.get();
		System.out.println(list.stream().filter(i->i%2==0).mapToInt(i->i*2).max());
//		int sum1=list.stream().filter(i->i%2==0).mapToInt(i->i*2)
//				.sum();
//		System.out.println(sum1);
		
//		List<Integer> doubles=list.stream().filter(i->i%2==0).map(i->i*2)
//				.toList();
//		System.out.println(doubles);
		
		
//		List<String> str=Arrays.asList("roshan","ahmed","md","hel","hello");
//		List<String> str1=str.stream().filter(i->i.length()>3).map(i->i.toUpperCase()).toList();
//		System.out.println(str1);
		
		
		List<Integer> nums=Arrays.asList(2,4,5,3,1,6,8);
		int op=nums.stream().filter(i->i%2!=0).map(i->i*i).findFirst().get();
		System.out.println(op);
	}

}
