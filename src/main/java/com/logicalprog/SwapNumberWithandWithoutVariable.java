package com.logicalprog;

public class SwapNumberWithandWithoutVariable {
public static void main(String[] args) {
	// Without Third Variable
	System.out.println("Without Third Variable");
	int a = 10;
	int b = 20;
	System.out.println("Before Swap : " + a + " " + b);
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("After Swap " + a + " " + b);
	
	// With Third Variable
	System.out.println("With Third Variable");
	int x = 1;
	int y = 2;
	System.out.println("Before Swap : " + x + " " + y);
	int z = x;
	x = y;
	y = z;
	System.out.println("After Swap : " + x + " " + y);
}
}
