package com.hm.methodreference;

public class Multithreading {
	public void m1() {
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
		
	}
	
	
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("child Thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		
	}

}
