package com.Java8.Oct_18;

import java.util.*;
import java.util.Collections;
import java.util.List;
class EmployeeName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class SortingWithLambda {
	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(10,2,32,4,91,7,21);
		Collections.sort(num);
		//System.out.println(num);
		
		
		Employee e1= new Employee(4,"javeed",657);
		Employee e2= new Employee(3,"mohith",568);
		Employee e3= new Employee(5,"kunal",567);
		Employee e4= new Employee(1,"suraj",123);
		
		Comparator<Employee> CompareByName=(emp1,emp2)->emp1.getName().compareTo(emp2.getName());
		Comparator<Employee> CompareById=(emp1,emp2)->emp1.getId()-emp2.getId();

		List<Employee> list= Arrays.asList(e1,e2,e3,e4);
		//Collections.sort(list, CompareById);
		Collections.sort(list,(em1,em2)->em1.getId()-em2.getId());
		
		
//		for(var v:list)
//			System.out.println(v.toString());
		
		//num.forEach((x)-> System.out.println(x));
		//Method Reference
		num.forEach(System.out::println);
		
		list.forEach(x-> System.out.println(x));
	
	}
	
}
