package com.string.programs;

public class StringReverse_1 {
public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "";
	for(int i=s1.length()-1;i>=0;i--) {
		s2+=s1.charAt(i);
	}
	System.out.println("After Reverse is : " + s2);
}
}
