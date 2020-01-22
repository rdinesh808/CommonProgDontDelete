package com.isttoest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class RandomDateGen {
public static void main(String[] args) {
	Random r = new Random();
	int minDay = (int) LocalDate.of(1990, 1, 1).toEpochDay();
	int maxDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
	long randomDay = minDay + r.nextInt(maxDay - minDay);
	LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LL/dd/yyyy");
	String RandomDob = randomBirthDate.format(formatter);
	System.out.println(RandomDob);
}
}
