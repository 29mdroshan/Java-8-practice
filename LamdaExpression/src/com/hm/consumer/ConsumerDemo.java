package com.hm.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c = i -> System.out.println("Hello :" + i);

		c.accept("roshan");

		BiConsumer<String,String> c2 = (a,b) -> System.out.println(a+b);

		c2.accept("roshan","ahmed");
		

	}

}
