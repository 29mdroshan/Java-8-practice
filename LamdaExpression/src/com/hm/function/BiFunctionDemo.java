package com.hm.function;

import java.util.function.BiFunction;
import java.util.function.IntToDoubleFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<String,String, Integer> bf1=(a,b)->a.length()+b.length();
		System.out.println(bf1.apply("Mohammed", "Roshan"));
		
		
		IntToDoubleFunction f2=i->Math.sqrt(i);
		System.out.println(f2.applyAsDouble(25));
	}

}
