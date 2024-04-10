package com.hm.staticmethod;

interface interf{
	public static void method() {
		System.out.println("This is a static method");
	}
}
public class StaticMethodDemo implements interf {

	public static void main(String[] args) {
		StaticMethodDemo sm= new StaticMethodDemo();
		interf.method();
	}
}
