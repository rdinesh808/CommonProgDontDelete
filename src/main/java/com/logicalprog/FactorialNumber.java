package com.logicalprog;

public class FactorialNumber {
public static void main(String[] args) {
	int n = 10;
	int a = 1;
	for(int i=1;i<=n;i++) {
		a = a*i;
	}
	System.out.println("The Factorial Value is : " + a);
}
}
