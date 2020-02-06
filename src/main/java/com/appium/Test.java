package com.appium;

public class Test {
public static void main(String[] args) {
	String s1 = "Please confirm that you want to save this document on the permanent record for:dfr Romgd (Patient ID: 1032357)";
	char ch = s1.charAt(79);
	String s2 = String.valueOf(ch);
	if(s2=="\\s") {
		System.out.println("Space");
	}else {
		System.out.println("Not Space");
	}
}
}
