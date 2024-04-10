package com.Java8.Oct_18;

interface Scannable{
	void scan();
	
}

class Scanner implements Scannable{

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("From Outer Expression");
		
	}
	
}

public class LambdaExpression {
	public static void main(String[] args) {
//		Scannable scanner=new Scannable() {
//
//			@Override
//			public void scan() {
//				// TODO Auto-generated method stub
//				System.out.println("Scanner from inner class");
//				
//			}
//			
//		};
//		Scannable scanner=()->System.out.println("From lamda expression");
		
		Scanner scanner = new Scanner();
		scanner.scan();
		
	}
}



