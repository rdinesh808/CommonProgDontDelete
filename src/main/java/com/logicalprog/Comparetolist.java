package com.logicalprog;

import java.util.*;

public class Comparetolist {
public static void main(String[] args) {
	List<Integer> al1 = new ArrayList<Integer>();
	List<Integer> al2 = new ArrayList<Integer>();
	al1.add(1);al1.add(3);
	al2.add(1);al2.add(2);
	
	boolean b = al1.equals(al2);
	if(b==true) {
		System.out.println("Values are same");
	}else {
		System.out.println("Values are not same");
	}
}
}
