package com.practiceproject.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(1,"a");
		map1.put(2,"b");
		map1.put(3,"c");
		
		HashMap<Integer,String> map2=new HashMap<>();
		map2.put(3,"c");
		map2.put(1,"a");
		map2.put(2,"b");
		
		HashMap<Integer,String> map3=new HashMap<>();
		map3.put(1,"a");
		map3.put(2,"b");
		map3.put(3,"c");
		map3.put(3,"d");
		
		//1.on basis of key-value
		System.out.println(map1.equals(map2));//true
		System.out.println(map1.equals(map3));//false
		
		//2.compare hashmaps for the same key:keyset()
		System.out.println(map1.keySet().equals(map2.keySet()));//true
		System.out.println(map1.keySet().equals(map3.keySet()));//true
		
		//3. find out extra key:combine the keys from  both the maps  :using hash set
		HashMap<Integer,String> map4=new HashMap<>();
		map4.put(1,"a");
		map4.put(2,"b");
		map4.put(3,"c");
		map4.put(4,"d");
		
		HashSet<Integer> combine=new HashSet<>(map1.keySet());
		combine.addAll(map4.keySet());
		combine.removeAll(map1.keySet());
		System.out.println(combine);
		
		
		//4. compare maps by value
		HashMap<Integer,String> map5=new HashMap<>();
		map5.put(1,"a");
		map5.put(2,"b");
		map5.put(3,"c");
		
		HashMap<Integer,String> map6=new HashMap<>();
		map6.put(4,"a");
		map6.put(5,"b");
		map6.put(6,"c");
		
		HashMap<Integer,String> map7=new HashMap<>();
		map7.put(1,"a");
		map7.put(2,"b");
		map7.put(3,"c");
		map7.put(4,"c");
		
		//a. duplicates are not allowed: using ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false

		//b. duplicates are allowed : using HashSet
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));//true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true

		
	}

}
