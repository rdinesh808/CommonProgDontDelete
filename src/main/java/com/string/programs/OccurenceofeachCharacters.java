package com.string.programs;
import java.util.*;
public class OccurenceofeachCharacters {
public static void main(String[] args) {
	String s1 = "hello";
	char[] ch = s1.toCharArray();
	Map<Character,Integer> m1 = new HashMap<Character, Integer>();
	
	for(char c : ch) {
		if(m1.containsKey(c)) {
			m1.put(c, m1.get(c)+1);
		}else {
			m1.put(c,1);
		}
	}
	System.out.println(m1);
	
//	for(Map.Entry<Character, Integer> m2 : m1.entrySet()) {
//		System.out.println(m2.getKey() + " = " + m2.getValue());
//	}
}
}
