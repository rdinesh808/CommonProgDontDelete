package com.patterns;

public class Pattern_11 {
public static void main(String[] args) {
	int a = 5/2+1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(j==a||j==5-a+1) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
		}
		if(i<=5/2)
			a--;
		else
			a++;
		System.out.println();
	}
}
}
