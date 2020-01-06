package com.logicalprog;

public class IntegerReverse {
public static void main(String[] args) {
	int n = 12321;
	int sum = 0;
	int n1 = n;
	while(n>0) {
		int r = n%10;
		sum = (sum*10) + r;
		n/=10;
	}
	if(n1==sum) {
		System.out.println("Number is Palindrom");
	}
	else {
		System.out.println("Number is not Palindrom");
	}
}
}
