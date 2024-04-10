package com.practiceproject.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		
		//1.: Collection.synchronizedList
		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		list.add("Mohammed");
		list.add("Roshan");
		list.add("Ahmed");
		
		//to add, remove - we dont need explicit synchronization
		//to fetch/travers the values- we need explicit synchronization
		//by self : - no use
		synchronized (list) {
			Iterator<String> it= list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}	
		}
		
		
		//2.copyOnWriteArrayList --its a class: thread safe
		
		CopyOnWriteArrayList<String> list2 =new CopyOnWriteArrayList<String>();
		
		list2.add("yash");
		list2.add("priya");
		list2.add("arun");
		Iterator<String> it= list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
