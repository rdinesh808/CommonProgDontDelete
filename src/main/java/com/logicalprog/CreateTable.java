package com.logicalprog;

import java.util.Scanner;

public class CreateTable {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int n = s1.nextInt();
	for(int i=1;i<=20;i++) {
		int n1 = n * i;
		System.out.println(i + " * " + n + " = " + n1);
	}
}
}
