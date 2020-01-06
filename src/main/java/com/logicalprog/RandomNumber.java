package com.logicalprog;
import java.util.Random;
public class RandomNumber {
public static void main(String[] args) {
	Random r = new Random();
	
	for(int i=1;i<=10;i++) {
		System.out.print(r.nextInt(100) + " ");
	}
}
}
