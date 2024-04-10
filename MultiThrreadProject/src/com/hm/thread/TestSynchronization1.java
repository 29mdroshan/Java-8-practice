package com.hm.thread;

class Table {
	 synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(n+"*"+i+"= "+n * i);
		}

	}
}

class MyThread1 implements Runnable {
	Table t =new Table();
	public void run() {
		t.printTable(5);
	}

}

class MyThread2 implements Runnable {
	Table t =new Table();
	public void run() {
		t.printTable(10);
	}
}

class TestSynchronization1 {
	public static void main(String args[]) {
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
	}
}
