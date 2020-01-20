package com.facker.examp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;
public class FackeExample {
public static void main(String[] args) {
	Faker f = new Faker();
	
	String Firstname = f.name().firstName();
	System.out.println(Firstname);
	
	String Address1 = f.address().streetAddress();
	System.out.println(Address1);
	
	String City = f.address().city();
	System.out.println(City);
	
	String State = f.address().stateAbbr();
	System.out.println(State);
	
	String fullname =f.name().fullName();
	System.out.println(fullname);
	
	String middle =f.name().nameWithMiddle();
	System.out.println(middle);
	
	String username =f.name().username();
	System.out.println(username);
	
	String title =f.name().title();
	System.out.println(title);
	
	String prefix =f.name().prefix();
	System.out.println(prefix);
	
	String sufix =f.name().suffix();
	System.out.println(sufix);
	
	String email =Firstname+"@test.com";
	System.out.println(email);
	
	String idnum = f.idNumber().valid();
	System.out.println(idnum);
	
	Date date_time = f.date().birthday(1994, 2020);
	System.out.println(date_time);
}
}
