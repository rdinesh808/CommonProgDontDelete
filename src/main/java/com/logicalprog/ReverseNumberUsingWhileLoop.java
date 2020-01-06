package com.logicalprog;

public class ReverseNumberUsingWhileLoop {
public static void main(String[] args) {
	int n = 123456789;
	int n1 = n;
	int r = 0;
	while(n!=0) {
		r = r * 10;
		r = r + n%10;
		n/=10;
	}
	System.out.println("The Reverse Number is : " + r);
}
}
