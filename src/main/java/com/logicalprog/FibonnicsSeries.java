package com.logicalprog;

public class FibonnicsSeries {
public static void main(String[] args) {
	int F1 = 0;
	int F2 = 1;
	int F3 = 0;
	int i = 0;
	while(i<10) {
		F3 = F1 + F2;
		F1 = F2;
		F2 = F3;
		System.out.print(F3 + " ");
		i++;
	}
}
}