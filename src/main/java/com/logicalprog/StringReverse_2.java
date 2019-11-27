package com.logicalprog;

public class StringReverse_2 {
public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "";
		/*
		 * for(int i=s1.length()-1;i>=0;i--)  { 
		 * s2 += s1.charAt(i); 
		 * }
		 * System.out.println(s2);
		 */
	
		/*
		 * char s3[] = s1.toCharArray(); 
		 * for(int i=s3.length-1;i>=0;i--) { 
		 * s2 += s3[i];
		 * } 
		 * System.out.println(s2);
		 */
	
	   StringBuilder sb = new StringBuilder();
	   for(int i = s1.length() - 1; i >= 0; --i) {
	     sb.append(s1.charAt(i));}
	   System.out.println(sb);
}
}
