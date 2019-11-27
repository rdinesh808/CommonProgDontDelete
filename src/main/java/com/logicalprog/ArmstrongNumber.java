package com.logicalprog;

public class ArmstrongNumber {
public static void main(String[] args) {
	int n = 153;
	int sum = 0;
	int n1 = n;
	while(n>0) {
		int r = n%10;
		sum+=(r*r*r);
		n/=10;
	}
	if(sum == n1) {
		System.out.println("Armstrong Number");
	}
	else {
		System.out.println("is not Armstrong Number");
	}
}
}
