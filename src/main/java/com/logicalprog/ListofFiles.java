package com.logicalprog;
import java.io.*;
public class ListofFiles {
public static void main(String[] args) throws Exception {
	File file_1 = new File(System.getProperty("user.home")+"\\Downloads");
	File []file_2 = file_1.listFiles();
	String s1 = "";
	for(int i=0;i<file_2.length;i++) {
		s1 = file_2[i].getName();
		if(s1.equals("Dinesh.pdf")) {
			System.out.println("File Present");
		}
	}
}
}
