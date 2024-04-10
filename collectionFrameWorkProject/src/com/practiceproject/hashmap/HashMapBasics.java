package com.practiceproject.hashmap;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
	public static void main(String[] args) {
		
		HashMap<String,String> capital= new HashMap<String,String>();
		capital.put("India","New Delhi");
		capital.put("India","old Delhi");
		capital.put("uk","London");
		capital.put(null,"berlin");
		capital.put("Russia",null);
		
		//to remove
		capital.remove(null);
		
		System.out.println(capital.get("Russia"));
		//iterator :over keys
		Iterator<String> it=capital.keySet().iterator();
		while(it.hasNext()) {
			String key= it.next();
			String value=capital.get(key);
			System.out.println("key:"+key+", value:"+value);
		}
		System.out.println("___________");
		//iterator:over set
		Iterator<Entry<String, String>> it1=capital.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String,String> entry=it1.next();
			System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
		}
		
		System.out.println("___________");
		//using lamda
		capital.forEach((k,v)->System.out.println("key:"+k+", value:"+v));
		
		
		
	}

}
