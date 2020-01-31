package com.string.programs;

public class RemoveHTMLTagfromgiveString {
public static void main(String[] args) {
	String s1 = "<p><b>Welcome to Tutorials Point</b></p>";
	System.out.println("Before removing HTML Tags: " + s1);
    s1 = s1.replaceAll("\\<.*?\\>", "");
    System.out.println("After removing HTML Tags: " + s1);
}
}
