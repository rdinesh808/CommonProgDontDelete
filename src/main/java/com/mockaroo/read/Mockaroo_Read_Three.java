package com.mockaroo.read;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.*;

public class Mockaroo_Read_Three {
	static URL url;
	static HttpURLConnection conn;
	static Map<String, String> m1 = new HashMap<String, String>();
	@BeforeSuite
	public static void mockread() {
		try {
			url = new URL("https://my.api.mockaroo.com/test_datas.json?key=a7252f70&__method=POST");
		    conn = (HttpURLConnection) url.openConnection();
			String outputString = IOUtils.toString(conn.getInputStream());
			String[] StringArray1 = outputString.substring(1, outputString.length()-1).split(","); 
			m1.put(StringArray1[0].replaceAll("\"","").trim(),StringArray1[1].replaceAll("\"","").trim());
			System.out.println(m1.get("first_name"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		mockread();
	}
}
