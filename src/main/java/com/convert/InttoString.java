package com.convert;

public class InttoString {
public static void main(String[] args) {
	
	// Int to String
	int n = 12345;
	String s1 = String.valueOf(n);
	System.out.println(s1);
	
	// String to Int
	String s2 = "67890";
	int a = Integer.valueOf(s2);  // Valueof
	int b = Integer.parseInt(s2);  // ParseInt
	System.out.println(a);
}
}
