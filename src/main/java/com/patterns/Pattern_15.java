package com.patterns;

public class Pattern_15 {
public static void main(String[] args) {
	String s1 = "COMPUTER";
	char[] ch = s1.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(ch[j] + " ");
		}
		System.out.println();
	}
}
}
