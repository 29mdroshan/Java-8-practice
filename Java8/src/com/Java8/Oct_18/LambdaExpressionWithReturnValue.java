package com.Java8.Oct_18;

interface Calculator{
	public int calculator(int a, int b);
}

public class LambdaExpressionWithReturnValue {
	public static void main(String[] args) {
//		Calculator calc=(a,b)->{
//			int sum=a+b;
//			return sum;
//			
//		};
		
		Calculator calc=(a,b)->a+b;
		int sum=calc.calculator(10, 20);
		System.out.println(sum);
	}

}
