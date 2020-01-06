package com.logicalprog;

public class LogicalPrograms {
	LogicalPrograms(){
	}
public static void main(String[] args) {
	String str = "geeks01$$for02geeks03!@!!";
	String s1 = "";
	String s2 = "";
	String s3 = "";
	 for (int i=0; i<str.length(); i++) {
		 if(Character.isDigit(str.charAt(i))) {
			 s1+=str.charAt(i);
		 }else if(Character.isAlphabetic(str.charAt(i))) {
			 s2+=str.charAt(i);
		 }else {
			 s3+=str.charAt(i);
		 }
	 }
	 System.out.println("Numeric is : " + s1 +"\nString is : " + s2 + "\nSpecial Char is : " + s3);
}
}
