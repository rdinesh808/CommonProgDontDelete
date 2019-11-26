package com.logicalprog;

public class AllDigitCount {
public static void main(String[] args) {
	int n = 12345678;
	int sum = n;
	while(n>9) {
		sum = 0;
		while(n>0) {
			int r = n%10;
			sum+=r;
			n/=10;
		}
		n = sum;
	}
	System.out.println("The Digit Count is : " + sum);
}
}
