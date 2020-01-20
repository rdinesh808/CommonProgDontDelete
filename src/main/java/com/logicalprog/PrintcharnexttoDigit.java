package com.logicalprog;

public class PrintcharnexttoDigit {
public static void main(String[] args) {
	String s1 = "h3s#Gk8&rt63Fn";
	for(int i=0;i<s1.length();i++){
		if(Character.isDigit(s1.charAt(i)))
	     if(Character.isAlphabetic(s1.charAt(i+1))){
	    	 System.out.println(s1.charAt(i+1)); 
	     }
	     else{
	    	 continue;
	     }
	}
	}
}
