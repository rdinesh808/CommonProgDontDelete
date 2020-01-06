package com.file.handling;

import java.io.File;
import java.io.IOException;

public class GetSizeofFile {
public static void main(String[] args) throws Exception {
	File file = new File("E:\\KURUVILLA");
	File file1 = new File(file, "New.txt");
	file.mkdir();
	file1.createNewFile();
	System.out.println("File Size : " + file1.length() + " bytes.");
}
}
