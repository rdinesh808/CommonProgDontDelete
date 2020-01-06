package com.logicalprog;

import java.util.Scanner;

public class CheckGivenNumberisEvenorOdd {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int n = s1.nextInt();
	if(n%2==0) {
		System.out.println("The Given is Even");
	}
	else {
		System.out.println("The Given is Odd");
	}
}
}
