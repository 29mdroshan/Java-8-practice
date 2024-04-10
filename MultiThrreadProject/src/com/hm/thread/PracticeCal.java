package com.hm.thread;

class calculateTables{
	public synchronized void calculator(int num) {
		for (int i=0;i<=10;i++) {
			System.out.println(num +"*"+i+"= "+num*i);
		}
	}
}
class SomeThread1 extends Thread{
	calculateTables ct;
	SomeThread1(calculateTables ct){
		this.ct=ct;
	}
	
	@Override
	public void run() {
		ct.calculator(3);
	}
}
class SomeThread2 extends Thread{
	calculateTables ct;
	SomeThread2(calculateTables ct){
		this.ct=ct;
	}
	
	@Override
	public void run() {
		ct.calculator(5);
	}
}
public class PracticeCal {
	public static void main(String[] args) {
		calculateTables ct=new calculateTables();
		SomeThread1 t1=new SomeThread1(ct);
		SomeThread2 t2=new SomeThread2(ct);
		t1.start();
		
		t2.start();
	
		System.out.println(t1.isDaemon());
		System.out.println(t2.getName());
	}

}
