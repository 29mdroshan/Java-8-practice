package com.practiceproject.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//default capacity is 10
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Mohammed");
		ar.add("ahmed");
		ar.add("roshan");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("________");
		
		ar.forEach(i-> System.out.println(i));
		System.out.println("________");
		Iterator<String> it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,3));
		numbers.forEach(i->System.out.println(i));
		
		
	}

}
