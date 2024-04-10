package com.Java8.Oct_20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateExample {
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(1995, 10, 20);
		System.out.println(date);
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate);
		boolean ans=date.isBefore(currentDate);
		System.out.println(ans);
		
		ans=date.isAfter(currentDate);
		System.out.println(ans);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a date: ");
		String dateString=scan.next();
		//LocalDate mydate=LocalDate.parse(dateString);
		LocalDate mydate=LocalDate.parse(dateString,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(mydate);
	}

}
