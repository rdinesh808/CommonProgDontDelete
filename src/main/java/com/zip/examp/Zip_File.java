package com.zip.examp;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.Zip;
public class Zip_File {
public static void main(String[] args) throws Exception {
	Zip zip = new Zip();
    try {
        Zip.zip(new File("D:\\TmpFS"));
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
