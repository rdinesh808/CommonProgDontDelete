package com.random;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomSSN {
public static void main(String[] args) {
	Random r = new Random();
	int num1 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
	int num2 = r.nextInt(74);
	int num3 = r.nextInt(200);
	DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
	//DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros
	String ssn = df3.format(num1) + "-" + df3.format(num2) + "-" + df3.format(num3);
	System.out.println(ssn);
}
}
