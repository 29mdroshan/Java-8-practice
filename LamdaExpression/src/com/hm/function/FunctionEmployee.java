package com.hm.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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

public class FunctionEmployee {
	 public static void main(String[] args) {
		 List<Employee> list= Arrays.asList(new Employee("roshan","manager",20000),
					new Employee("yash","lead",15000),
					new Employee("ahmed","manager",30000),
					new Employee("rahul","develop",22000));
		 
		 Predicate<Float> p=i->i>15000;
		 Function<List<Employee>,Integer> f=(employee)->{
			 int count=0;
			 for(Employee emp:employee)
			 {
				 if(p.test(emp.getSalary()))
					 count+=emp.getSalary();
			 }
				 
			 return count;
		 };
		 
		 System.out.println(f.apply(list));
	}
}
