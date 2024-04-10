package com.hm.methodreference;

interface Interf1{
	public void method();
}
public class MethodReference {
	public static void m1() {
		System.out.println("method reference");
	}
	public static void main(String[] args) {
		Interf1 i=MethodReference::m1;
		i.method();
	}
}
