package com.logicalprog;

import java.util.Arrays;

public class ArraySorting {
public static void main(String[] args) {
	int n[] = {30,50,20,40,10,90,60,80,70};
	Arrays.sort(n);
	System.out.print(n + " ");
	
		/*
		 * for(int i=0;i<=n.length-1;i++) { for(int j=i+1;j<=n.length-1;j++) {
		 * if(n[i]>n[j]) { int temp = n[i]; n[i] = n[j]; n[j] = temp; } }
		 * System.out.print(n[i] + " "); }
		 */
}
}
