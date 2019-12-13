package com.logicalprog;

import java.util.Arrays;

public class RepeatedElementinArray {
public static void main(String[] args) {
	int[] n = {1,3,5,7,2,2,3,1,6};
	
	for(int i=0;i<=n.length-1;i++) {
		for(int j=i+1;j<=n.length-1;j++) {
			if(n[i]==n[j]) {
				Arrays.sort(n);
				System.out.print(n[i] + " ");
			}
		}
	}
}
}
