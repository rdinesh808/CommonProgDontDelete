package com.file.handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CreateNewFolderintoFile {
public static void main(String[] args) {
	try {
		File file = new File("E:\\KURUVILLA");
		File file1 = new File(file, "New.txt");
		file.mkdir();
		boolean b1 = file1.createNewFile();
		FileOutputStream fos = new FileOutputStream(file1);
		String s1 = "File Handling Concept...!!!!!";
		byte []b = s1.getBytes();
		fos.write(b);
		fos.close();
		FileInputStream fis = new FileInputStream(file1);
		int i = 0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
