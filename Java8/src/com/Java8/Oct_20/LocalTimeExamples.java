package com.Java8.Oct_20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeExamples {
	public static void main(String[] args) {
		LocalTime time=LocalTime.of(10, 20,30);
		System.out.println(time);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println(currentTime);
		
		LocalDate date=LocalDate.parse("2020-10-15");
		LocalDateTime dateTime=LocalDateTime.now();
		LocalDateTime dateTime1=LocalDateTime.of(date,currentTime);
		System.out.println(dateTime1);
	}

}
