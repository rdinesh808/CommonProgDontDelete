package com.file.handling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\KURUVILLA");
		File file1 = new File(file, "New.txt");
		file.deleteOnExit();
		file1.delete();
	}
}
