package com.logicalprog;

public class Matrix_Prob1 {
public static void main(String[] args) {
	int n1[][] = {{1,0,1,0},{0,1,0,1},{1,0,1,1}};
	int n2[][] = new int[3][4];
	
	System.out.println("Before Matrix..");
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(n1[i][j] + " ");
		}
		System.out.println();
	}
	
	int n = 1;
	System.out.println("After Matrix..");
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			if(n1[i][j]==1) {
				n1[i][j] = n++;
			}
			System.out.print(n1[i][j] + " ");
		}
		System.out.println();
	}
}
}
