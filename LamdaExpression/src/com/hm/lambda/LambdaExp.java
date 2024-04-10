package com.hm.lambda;


@FunctionalInterface
interface Addition{
	public int add(int a, int b);
	
	default void defaultMethod(String name) {
		System.out.println("Hello :"+name);
	};
	public static void staticMethod() {
		System.out.println("This is a static Method");
	}
}
public class LambdaExp {
	public static void main(String[] args) {
	 
		Addition addition=(a,b)->a+b;
		System.out.println(addition.add(100, 200));
		
		addition.defaultMethod("roshan");
		
		Addition.staticMethod();
		 
	}

	
}
