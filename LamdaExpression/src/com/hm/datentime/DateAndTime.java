package com.hm.datentime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		System.out.println(dd+"..."+mm+"...."+yyyy);
		System.out.printf("%d-%d-%d",mm,dd,yyyy);
		System.out.println();
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		System.out.println(h+"...."+m+"...."+s);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		//same methods can be used
		LocalDateTime dt2=LocalDateTime.of(2000,06,29,8,45);
		System.out.println(dt2);
		
		System.out.println("after six months: "+dt.plusMonths(6));
		System.out.println("after six minutes: "+dt.plusMinutes(6));
		
		LocalDate birthd=LocalDate.of(2000, 6, 29);
		Period p=Period.between(birthd, date);
		System.out.println(p);
		System.out.println(p.getYears());
		
		System.out.println("Please enter a year");
		Scanner scan=new Scanner(System.in);
		int y=scan.nextInt();
		Year year=Year.of(y);
		if(year.isLeap())
			System.out.println("It's a leap year");
		else
			System.out.println("It's not a leap year");
		
		
	}

}
