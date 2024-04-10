package com.practiceproject.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("roshan");
		ll.add("yash");
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ll.add(2,"ahmed");
		
		
		LinkedList<String> user=new LinkedList<>();
		user.add("priya");
		user.add("pinky");
		
		ll.addAll(user);
		
		
		ll.addFirst("Mohammed");
		ll.addLast("sandesh");
		
		System.out.println(ll);
		ll.remove(3);
		
		ll.removeAll(user);
		
		System.out.println(ll);
		//printing reverse order
		Iterator<String> it1=ll.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//sort
		Collections.sort(ll);
		System.out.println(ll);
		
	}

}
