package com.Java8.Oct_18;

interface Player{
	public void play(String playerName);
}

interface FindLargest{
	public int printLargest(int a, int b);
}

public class LambdaExpressionWithArguments {
	public static void main(String[] args) {
		//Lambda expression using single statement
//		Player p1=(playerName)->System.out.println("Hello : "+playerName);
//		p1.play("roshan");
		
		
		//Lambda expression using multiple statement
//		Player p1=pName->{
//			System.out.println("Hey : "+pName);
//			System.out.println("Let's play the game");
//		};
//		p1.play("roshan");
		
		
//		FindLargest fl=(a,b)->{
////			if (a>b)
////				System.out.println(a+" is greater than "+b);
////			else
////				System.out.println(b+" is greater than "+a);
//			
//			int largest =a>b?a:b;
//			System.out.println("Largest is "+largest);
//		};
//		
//		fl.printLargest(20, 50);
		
		FindLargest fl1=(a,b)->{
		return a>b?a:b;
		};
		System.out.println("the largest number is : "+fl1.printLargest(100, 777));
		
		
		
	}

}
