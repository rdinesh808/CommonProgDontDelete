package com.logicalprog;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int n = s1.nextInt();
	int sum = 0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum+=i;
		}
	}
	if(sum==n) {
		System.out.println("Perfect Number");
	}
	else {
		System.out.println("Not Perfect Number");
	}
}
}
