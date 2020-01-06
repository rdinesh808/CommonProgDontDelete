package com.logicalprog;

public class ReverseastringwithoutusingStringinbuiltFunction {
	public static void main(String[] args) {
		          String str = "Automation";
		          StringBuilder str2 = new StringBuilder();
		          StringBuffer str3 = new StringBuffer();
		          str2.append(str);
		          str3.append(str);
		          str2 = str2.reverse();
		          str3 = str3.reverse();
		          System.out.println("-----StringBuilder-----");
		          System.out.println(str2);
		          System.out.println("-----StringBuffer-----");
		          System.out.println(str3);
		          }
}
