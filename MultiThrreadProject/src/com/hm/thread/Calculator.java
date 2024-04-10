package com.hm.thread;

class Tables {
	  void calculate(int num) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(num + "*" + i + "=" + i * num);
		}
	}

}

class Calculator implements Runnable {
	Tables tab1;
	public int num = 3;

	public  void run() {
		tab1 = new Tables();

		tab1.calculate(num);

	}

	public static void main(String args[]) {
		Calculator m1 = new Calculator();
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
		t1.start();

		Calculator m2 = new Calculator();
		m1.num = 10;
		Thread t2 = new Thread(m2); // Using the constructor Thread(Runnable r)
		t2.start();

	}
}