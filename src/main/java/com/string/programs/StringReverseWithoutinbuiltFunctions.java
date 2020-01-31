package com.string.programs;
import java.util.*;
public class StringReverseWithoutinbuiltFunctions {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s2 = s1.next();
	StringBuffer sb = new StringBuffer();
	sb.append(s2);
	System.out.println("Before reverse : " + sb);
	sb.reverse();
	System.out.println("After Reverse : " + sb);
}
}
