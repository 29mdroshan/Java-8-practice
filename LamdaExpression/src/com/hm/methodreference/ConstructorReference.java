package com.hm.methodreference;

class Sample{
	Sample(){
		System.out.println("Constructor reference");
	}
}
interface Interf2{
	public Sample get();
}
public class ConstructorReference {
	public static void main(String[] args) {
		Interf2 i=Sample::new;
		i.get();
	}
}
