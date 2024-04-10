package com.hm.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	private String name;
	private String role;
	private float salary;
	public Employee(String name, String role, float salary) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
}
public class PredicatesEmployee {
	public static void main(String[] args) {
		List<Employee> list= Arrays.asList(new Employee("roshan","manager",20000),
				new Employee("yash","lead",15000),
				new Employee("ahmed","manager",30000),
				new Employee("rahul","develop",22000));
		
		
		Predicate<Employee> p1=emp->emp.getRole().equals("manager");
		Predicate<Employee> p2=emp->emp.getSalary()>20000;
		
		
		list.forEach(i->{if(p1.test(i))System.out.println(i.toString());});
		System.out.println("******");
		list.forEach(i->{if(p2.test(i))System.out.println(i.toString());});
		System.out.println("******");
		list.forEach(i->{if(p1.and(p2).test(i))System.out.println(i.toString());});
		
	}

}
