package com.random;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomTelephoneNumber {
public static void main(String[] args) {
	
	Random r = new Random();
	
	int num1 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
	//System.out.println(num1);
	
	int num2 = r.nextInt(743);
	//System.out.println(num2);
	
	int num3 = r.nextInt(10000);
	//System.out.println(num3);
	
	DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
	
	DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros
	
	String phoneNumber = df3.format(num1) + "-" + df3.format(num2) + "-" + df4.format(num3);
	
	System.out.println(phoneNumber);
	int a = r.nextInt(5);
	System.out.println(a + " " + (a + 1) * 100);
}
}
