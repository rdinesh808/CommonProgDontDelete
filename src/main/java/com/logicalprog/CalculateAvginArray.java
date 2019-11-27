package com.logicalprog;

import java.util.Scanner;

public class CalculateAvginArray {
	 public static void main(String[] args) {
      int n[] = {83,68,81,73,72};
      int sum = 0;
      for(int i=0;i<=n.length-1;i++) {
    	  sum = sum + n[i];
      }
      int avg = sum/(n.length);
      System.out.println("The Sum Value is : " + sum);
      System.out.println("The Avg Value is : " + avg);
  }
}
