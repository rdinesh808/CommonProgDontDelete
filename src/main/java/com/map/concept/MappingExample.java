package com.map.concept;

import java.util.*;

public class MappingExample {
public static void main(String[] args) {
	Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
	map1.put(1, "J");map1.put(2, "A");map1.put(3, "V");map1.put(4, "A");
	for(Map.Entry<Integer, String> m : map1.entrySet()) {
		int key = m.getKey();
		System.out.println(key + " " + map1.get(key));
	}
}
}
