package com.file.handling;

import java.io.*;;

public class createTextFile {
public static void main(String[] args) {
	try {
	File file = new File("E:\\one.txt");
	boolean b1 = file.createNewFile();
	if(b1==true) {
		System.out.println("File Created");
	}
	else {
		System.out.println("File not Created");
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
