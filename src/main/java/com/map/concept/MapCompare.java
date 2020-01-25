package com.map.concept;

import java.util.*;

public class MapCompare {
public static void main(String[] args) {
	int count = 0;
	Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
	Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
	map1.put(1, "J");map1.put(2, "A");map1.put(3, "V");map1.put(4, "A");
	map2.put(1, "J");map2.put(2, "E");map2.put(3, "V");map2.put(4, "A");
	for(Map.Entry<Integer,String> m : map1.entrySet()) {
		int key = m.getKey();
		String firstmapvalue = m.getValue();
		String secondmapvalue = map2.get(key);
		if(firstmapvalue.contains(secondmapvalue)) {
			  continue;  
		  }
		  else {
			  count =+1;
			  System.out.println("The Values Reflected in the Demographics Card has Mismatched!!! \n" +
			  "firstnmap : Key = " + key + " : Value = " + map1.get(key) + " Difference \n" + 
			  "secondmap : Key = " + key + " : Value = " + map2.get(key));
		  }
	}
	if (count==0) {
		System.out.println("Same");
	}else {
		System.out.println("Not Same");
	}
}
}
