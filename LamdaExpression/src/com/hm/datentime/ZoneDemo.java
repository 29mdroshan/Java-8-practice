package com.hm.datentime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDemo {
	public static void main(String[] args) {
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zonedate=ZonedDateTime.now(la);
		System.out.println(zonedate);
	}
}
