package com.hm.innerclass;

interface Interf{
	public void m1();
	
}
public class AnanomousNLamda {
	int x=888;
	public void   m2() {
		Interf i=new Interf(){
			int x=999;
			public void m1() {
				System.out.println(this.x);
			}
		};
		i.m1();
//		
//		Interf i=()->{
//			int x=999;
//			System.out.println(this.x);
//		};
//		i.m1();
	}
	
	public static void main(String[] args) {
		AnanomousNLamda t=new AnanomousNLamda();
		t.m2();
	}
}
