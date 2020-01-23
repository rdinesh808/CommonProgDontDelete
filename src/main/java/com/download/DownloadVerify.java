package com.download;

import org.testng.annotations.Test;
import java.io.File;

public class DownloadVerify {
	@Test
	public void tc1() {
		File file = new File(System.getProperty("user.dir")+"\\DownloadFile");
		File[] file1 = file.listFiles();
		for(int i=0;i<file1.length;i++) {
			boolean s1 = file1[i].delete();
			System.out.println(s1);
		}
	}
}
