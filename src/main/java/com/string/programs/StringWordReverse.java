package com.string.programs;

import java.util.Scanner;

public class StringWordReverse {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s2 = s1.nextLine();
	String s3 = "";
	for(int i=s2.length()-1;i>=0;i--) {
		s3+=s2.charAt(i);
	}
	System.out.println(s3);
}
}
