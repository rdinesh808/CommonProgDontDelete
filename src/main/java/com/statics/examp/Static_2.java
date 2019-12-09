package com.statics.examp;

public class Static_2 extends Static_1 {
	Static_2(){
		count++;
		System.out.println(count);
	}
	
public static void main(String[] args) {
	new Static_2();
	new Static_2();
	new Static_2();
}
}
