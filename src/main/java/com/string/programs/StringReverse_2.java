package com.string.programs;

public class StringReverse_2 {
public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "";
	char ch[] = s1.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		s2+=ch[i];
	}
	System.out.println("Reverse is After : " + s2);
}
}
