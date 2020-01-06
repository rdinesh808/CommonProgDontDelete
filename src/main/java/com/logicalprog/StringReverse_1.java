package com.logicalprog;

public class StringReverse_1 {
public static void main(String[] args) {
	String s1 = "Java is a Programming Language";
	String[] s2 = s1.split(" ");
	String s3 = "";
	for(int i=0;i<=s2.length-1;i++) {
		for(int j=s2[i].length()-1;j>=0;j--) {
			s3+=s2[i].charAt(j);
		}
	}
	System.out.println(s3);
}
}
