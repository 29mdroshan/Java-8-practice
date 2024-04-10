package com.Java8.Oct_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface ReduceString{
	public String shortString(String s); 
}

class CreateMethod{
	static int count=0;
	public int counting(List<String> list) {
		return (int)list.stream().filter(s->s.length()>2).count();
//		list.forEach(x->{if (x.length()>=3) count++;});
//		return count;
	}
	public List<String> removeString(List<String> list){
		List<String> l1= new ArrayList<>();
		list.forEach(x->{if (!x.isBlank()) l1.add(x);});
		return l1;
	}
	
}

public class Assignment {
	
	public static void main(String[] args) {
		String s="Indain Railway";
		
//		String arr[]=s.split(" ");
//		for (var v :arr)
//			System.out.print(v.charAt(0)+".");
		
		
//		List<String> str=Arrays.asList(s.split(" "));
//		str.forEach(x->System.out.print(x.charAt(0)+"."));
		
//		ReduceString rs=(s1)->{
//			String arr[]=s1.split(" " );
//			String empty="";
//			for(var v:arr)
//				empty+=v.charAt(0)+".";
//			return empty;
//			
//		};
//		
//		String output=rs.shortString("Happiest Minds");
//		System.out.println(output);
		
//		List<String> list1=Arrays.asList("apple","         ","ab","mango","");
//		
//		CreateMethod cm = new CreateMethod();
//		List<String>l1=cm.removeString(list1);
//		System.out.println(l1);
		
		String s1="HELLo";
		List<String> list=Arrays.asList("a","e","i","o","u");
		char ch[]=s1.toCharArray();
		String s2="";
		for(var v:ch) {
			if(list.contains(String.valueOf(v).toLowerCase()))
				continue;
			else
				s2+=String.valueOf(v).toLowerCase();
		}
		System.out.println(s2);
		
		
		
		
		
		
				

	
	}

}
