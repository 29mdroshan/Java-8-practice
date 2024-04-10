package com.practiceproject.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
	public static void main(String[] args) {
		
		
		Map<Number , String> map1=new HashMap<>();
		map1.put(1,"a");
		map1.put(2,"b");
		map1.put(3,"c");
		
		//1. create synchronized map
		Map<Number , String> synMap=Collections.synchronizedMap(map1);
		System.out.println(synMap.get(2));
		
		//2. concurrentHashMap : does not throw concurrentModificationException
		ConcurrentHashMap<Number , String> conMap=new ConcurrentHashMap<>();
		conMap.put(1,"a");
		conMap.put(2,"b");
		conMap.put(3,"c");
		System.out.println(conMap.get(2));
	}
}
