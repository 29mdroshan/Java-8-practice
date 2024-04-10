package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class ToCheckFib{
	public boolean isPerfectSquare(int num) {
		int temp=(int) Math.sqrt(num);
		return temp*temp==num?true:false;
	}
	
	public boolean isFibnocii(int num) {
		return isPerfectSquare(5*num*num+4)||isPerfectSquare(5*num*num-4);
	}
	
	public boolean isPrime(int num) {
		if(num>1) {
			for (int i = 2; i < num; i++) {  
		           if (num % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		}
		return false;
	}
	
	public int factorial(int num) {
		if(num==0)return 1;
		else return (num*factorial(num-1));
	}
}

public class BasicPrograms {
	
	public static void main(String[] args) {
		ToCheckFib ch=new ToCheckFib();
		//fibanocii number
//		int n1=0,n2=1,n3;
//		
//		System.out.print(n1+" "+n2);
//		
//		for(int i=2;i<10;i++) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
		
//		
//		List list1=new ArrayList();
//		
//		List<Integer> list=Arrays.asList(2,1,5,7,8,9,45,24,13);
//		list.forEach(i->{if(ch.isFibnocii(i))list1.add(i);});
//		
//		list1.forEach(i->System.out.print(i+" "));
		
		
		//prime number
		//System.out.println(ch.isPrime(13));
		
		
		//palindrome
//		String s1="roshan",rev="";
//		StringBuffer sb=new StringBuffer(s1);
//		if(s1.equals(String.valueOf(sb.reverse())))
//			System.out.println("plaindrome");
//		else {
//			System.out.println("Not a palindrome");
//		}
//		
//		char[] c=s1.toCharArray();
//		
//		for(int i=c.length-1;i>=0;i--) {
//			rev+=c[i];
//		}
//	    System.out.println(rev);
		
		//factorial
//		int num=5,fac=1;
//		for(int i=num;i>0;i--) {
//			fac*=i;
//		}
//		System.out.println(fac);
//		System.out.println(ch.factorial(5));
		
		
		//amstrong number
//		int amg=153, amg2 =amg,amg3 = 0;
//		while(amg2!=0) {
//			int remainder=amg2%10;
//			amg3+=Math.pow(remainder,3 );
//			amg2/=10;
//		}
//		
//		if(amg==amg3)System.out.println("Armstrong Number");
//		else System.out.println("No Armstrong Number");
		
		//program to count frequency
//		List<Integer> list=Arrays.asList(1,2,3,4,2,1,3,1,1,5,2,4,3);
//		String s3="Mohammed Roshan";
//		s3=s3.toLowerCase();
//		char[] c=s3.toCharArray();
//		List<Character> listArray = new ArrayList<>();
//		for (char i : c)
//		    listArray.add(i);
//		
//		Map<Character,Integer> map=new HashMap<>();
//		for(var i:listArray) {
//			if(map.containsKey(i)) {
//				map.put(i,map.get(i)+1 );
//			}
//			else {
//				map.put(i, 1);
//			}
//		}
//		map.forEach((k,v)->System.out.println("key:"+k+", value:"+v));
		
		
		//program to find largest and smallest word in string
//		String string="Hello how are you roshan";
//		String[] string2=string.split(" ");
//		int max=string2[0].length();
//		String maxword="";
//		int min=999;
//		String minword="";
//		for(var i:string2) {
//			if(i.length()>max) {
//				max=i.length();
//				maxword=i;
//			}
//			if(i.length()<=min) {
//				min=i.length();
//				minword=i;
//			}
//		}
//		System.out.println(maxword);
//		System.out.println(minword);
		
		//program to swap to string without temp
//		String s1="good";
//		String s2="morning";	
//		String s3=s1+s2;
//		s2=s3.substring(0, s1.length());
//		s1=s3.substring(s1.length());
//		System.out.println(s1+" "+s2);
		
//		String file="lipsum as it is sometimes known, graphic or web designs.";
//		String[] words=file.split(" ");
//		System.out.println(words.length);
		
		//neon number:
//		int number=45;
//		int neon=number*number;
//		int sum=0;
//		while(neon>0) {
//			int remainder=neon%10;
//			sum+=remainder;
//			neon/=10;
//		}
//		if(number==sum)System.out.println("Neon");
//		else System.out.println("Not neon");

		//evil number
		int num=16;
		String bin = Integer.toBinaryString(num);
		char[] c=bin.toCharArray();
		int count=0;
		for(var i:c) {
			if(i=='1')count+=1;
		}
		if(count%2==0)System.out.println("evil");
		else System.out.println("Not Evil");
	}

}
