package com.map.concept;

import java.util.ArrayList;

public class MapProg_2 {
public static void main(String[] args) {
	ArrayList<MobileNumber> al1 = new ArrayList<MobileNumber>();
	MobileNumber m1 = new MobileNumber("12345678");
	al1.add(m1);
	Address a1 = new Address("Mumbai");
    System.out.println(new Student("Java",100,a1,al1));
}
}
