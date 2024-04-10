package com.Java8.Oct_18;

interface print{
	public void printer(int a ,int b);
}
//class Hello implements print{
//
//	@Override
//	public void printer() {
//		// TODO Auto-generated method stub
//		System.out.println("from outer class");
//	}
//	
//}
public class Lambda {
	public static void main(String[] args) {
//		print h=new print() {
//			
//			@Override
//			public void printer(int a, int b) {
//				System.out.println("from lambda expression" +b);
//				System.out.println("from lambda expression" +a);
//				
//			}
//		};
		print p=(int b ,int a)->{
			System.out.println("from lambda expression" +b);
			System.out.println("from lambda expression" +a);
			};
		p.printer(10,20);
	}
	

}
