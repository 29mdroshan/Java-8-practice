package com.practiceproject.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorsDemo {
	public static void main(String[] args) {
		Vector<Integer> myVector=new Vector<>();
		myVector.add(1);
		myVector.add(2);
		myVector.add(1);
		myVector.add(4);
		myVector.add(3);
		System.out.println(myVector);
		myVector.remove(2);
		
		Iterator<Integer> it=myVector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
