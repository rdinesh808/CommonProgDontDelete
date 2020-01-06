package com.logicalprog;

public class SortanArray {
public static void main(String[] args) {
	int n[] = {40,50,10,30,20};
	for(int i=0;i<=n.length-1;i++) {
		for(int j=i+1;j<=n.length-1;j++) {
			if(n[i]>n[j]) {
				int temp = n[i];
				n[i] = n[j];
				n[j] = temp;
			}
		}
		System.out.print(n[i] + " ");
	}
}
}
