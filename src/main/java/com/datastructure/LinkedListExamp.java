package com.datastructure;

import java.util.LinkedList;

public class LinkedListExamp {
public static void main(String[] args) {
	LinkedList<String> l1  = new LinkedList<String>();
	LinkedList<String> l2  = new LinkedList<String>();
	l1.add("Linked");  // add method
	l1.add("list");
	l1.add(0, "Example of"); // add item with index
	l1.poll();
    l2.add("Add");
    l2.add("All");
    l2.poll();
    l1.addAll(l2); // addAll method
    System.out.println(l1);
}
}
