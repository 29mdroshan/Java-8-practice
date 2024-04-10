package com.hm.defaultmethod;

interface Interf1{
	default void m1() {
		System.out.println("this is from interface 1");
	}
}
interface Interf2{
	default void m1() {
		System.out.println("this is from interface 2");
	}
}
public class DefaultMethodDemo implements Interf1, Interf2{

	
	public void m1() {
//		System.out.println("this is from sub class");
//		interf1.super.m1();
		Interf2.super.m1();
	}
	public static void main(String[] args) {
		DefaultMethodDemo dm =new DefaultMethodDemo();
		dm.m1();
	}

}
