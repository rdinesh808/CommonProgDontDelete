package com.lambdaexpress;

interface one {
	public void add();
}

public class LambdaExpress_1 {
public static void main(String[] args) {
	one o1 = ()->{
		System.out.println("Lambda Expression");
	};
	o1.add();
}
}
