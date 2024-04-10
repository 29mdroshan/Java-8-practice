package com.hm.innerclass;

public class AnanomousInnerClass {
	public static void main(String[] args) {
		//anonymous inner class
//		Runnable r=new Runnable() {
//			public void run() {
//				for(int i=0;i<5;i++) {
//					System.out.println("Child thread");
//				}
//			}
//		};
		
		
		//use lamda expression
//		Runnable r=()->{
//			for(int i=0;i<5;i++) {
//				System.out.println("child Thread");
//			}
//		};
//		Thread t=new Thread(r);
		Thread t=new Thread(()->{
			for(int i=0;i<5;i++) 
			System.out.println("child Thread");
		});
		
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		
		
		
		
		
	}

}
