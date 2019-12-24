package com.classes.examp;

public class NestedClass {

	public void one(){
		System.out.println("I am from Outer Class");
	}
	class Nested{
		public void two(){
			System.out.println("I am from Inner Class");
		}
	}
	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
		nc.one();  // -- Outer Class
		NestedClass.Nested ncn = nc.new Nested();
		ncn.two();  // Inner Class
	}
}
