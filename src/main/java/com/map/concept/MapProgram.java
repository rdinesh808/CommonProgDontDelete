package com.map.concept;
import java.io.*;
import java.util.*;
public class MapProgram {
public static void main(String[] args) {
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	Map<ArrayList<Integer>,String> mp1 = new HashMap<ArrayList<Integer>, String>();
	
	al1.add(1);
	al1.add(2);
	al1.add(3);
	
	mp1.put(al1, "Java");
	mp1.put(al1, "Python");
	mp1.put(al1,"Machine lang");
	
	for(int i=0;i<=al1.size()-1;i++) {
	for(Map.Entry<ArrayList<Integer>,String> m : mp1.entrySet()) {
		Integer key = m.getKey().get(i);
		String value = m.getValue();
		System.out.println("Key = " + key + " " + "Value = " + value);
	}
	}
}
}
