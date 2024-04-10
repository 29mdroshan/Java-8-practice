package com.Java8.Oct_18;

interface Printable{
	public default void print() {
		System.out.println("Default Method");
		
	}
	public static void scan() {
		System.out.println("Scanning in Progress");
	}
}
interface Playable{
	public default void print() {
		System.out.println("Lets, Play");
	}
}

class Printer implements Printable,Playable {
	public  void print() {
		//Printable.super.print();
		System.out.println("Hello World");
		
	}

	
}
public class DefaultStaticMethods {
	public static void main(String[] args) {
		Printer p1=new Printer();
		p1.print();
		//Printable.scan();
		
	}

}
