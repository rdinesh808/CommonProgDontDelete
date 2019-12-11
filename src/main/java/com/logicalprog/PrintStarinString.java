package com.logicalprog;

public class PrintStarinString {
public static void main(String[] args) {
	String s1 = "javabana";
	char[] ch = s1.toCharArray();
		/*
		 * int n = 0; for(int i=0;i<ch.length;i++) { if(ch[i]=='a') { n++; for(int
		 * j=1;j<=n;j++) { System.out.print("*"); }
		 * 
		 * }else { System.out.print(ch[i]); } }
		 */
	
   for(int i=0;i<=ch.length-1;i++) {
	   String s2 = s1.replace("a", "*");
	   System.out.println(s2);
   }
}
}
