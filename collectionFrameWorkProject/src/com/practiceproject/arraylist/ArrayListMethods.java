package com.practiceproject.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Mohammed");
		ar1.add("ahmed");
		ar1.add("roshan");
		ar1.add("Mohammed");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("rahul");
		ar2.add("arun");
		ar2.add("yash");

		// to combine to arrayList
		// ar1.addAll(ar2);

		// to add from specific position
		// ar1.addAll(1,ar2);

		// to clear
		// ar1.clear();

		// toclone from one arrayList to another
		// ArrayList<String> cloneList=(ArrayList<String>) ar1.clone();

		// to check element is present or not
		// System.out.println(ar1.contains("Mohammed"));

		// to get the index
		// System.out.println(ar1.indexOf("roshan"));

		// to get the last index
		// System.out.println(ar1.lastIndexOf("Mohammed"));

		// to remove an element from list
		// ar2.remove(1);

		// remove if
		//ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		//numbers.removeIf(i->i%2 !=0);

		//to get the duplicates from array
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 4, 5, 5, 1, 8, 1,5,6));
		numbers.retainAll(Collections.singleton(1));
		
		
		//to get the sublist
		//ArrayList<Integer> number2=new ArrayList<Integer>(numbers.subList(2, 6));
		
		//to convert to array
//		Object  arr[]=numbers.toArray();
//		for(Object o:arr) {
//			System.out.println(o);
//		}
		numbers.forEach(i -> System.out.println(i));
	}

}
