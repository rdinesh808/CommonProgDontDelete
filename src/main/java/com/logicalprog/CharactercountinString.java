package com.logicalprog;

public class CharactercountinString {
	 public static void main(String[] args){
	        int count;
	        String s = "This is your string for example";
	        String[] split = s.split(" ");
	        for(String str: split) {
	            char[] ch = str.toCharArray();   
	            count = 0;                       
	            for(char c: ch) {
	                if(Character.isLetter(c)) {
	                    count++;               
	                }
	        }
	        System.out.print(count + " "); 
	        }
	    }
}
