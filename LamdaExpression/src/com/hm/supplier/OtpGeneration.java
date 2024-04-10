package com.hm.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class OtpGeneration {
	public static void main(String[] args) {
		Supplier<String> s=()->{
			String str="";
			for(int i=0;i<4;i++) {
				
				str+=(int)(Math.random()*10);
				
			}
			return str;
		};
		System.out.println(s.get());
		
	}

}
