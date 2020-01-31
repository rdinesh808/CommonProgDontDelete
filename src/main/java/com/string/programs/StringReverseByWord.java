package com.string.programs;

import java.util.Scanner;

public class StringReverseByWord {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s2 = s1.nextLine();
	String[] s3 = s2.split(" ");
	String s5 = "";
	for(int i=0;i<s3.length;i++) {
		String s4=s3[i]+" ";
		for(int j=s4.length()-1;j>=0;j--) {
			s5+=s4.charAt(j);
		}
	}
	System.out.println(s5.trim());
}
}
