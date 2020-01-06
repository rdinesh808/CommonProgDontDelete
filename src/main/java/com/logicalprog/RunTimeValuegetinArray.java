package com.logicalprog;
import java.util.*;
public class RunTimeValuegetinArray {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int n = s1.nextInt();
	System.out.println("Enter the " + n + " Numbers :");
	int[] n1 = new int[n];
	for(int i=0;i<=n-1;i++) {
		n1[i] = s1.nextInt();
	}
	// Sum the numbers
	int sum = 0;
	for(int i=0;i<=n1.length-1;i++) {
		sum = sum + n1[i];
	}
	int avg = sum/(n1.length);
	System.out.println("The Sum of Number is : " + sum);
	System.out.println("The Avg of Number is : " + avg);
}
}
