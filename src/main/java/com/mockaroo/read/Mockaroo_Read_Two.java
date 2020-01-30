package com.mockaroo.read;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;

public class Mockaroo_Read_Two {
	public static void main(String[] args) {
		Map<String, String> RandomValues = new LinkedHashMap<String, String>();
		ArrayList<String> al1 = new ArrayList<String>();
		try {
		URL url = new URL("https://my.api.mockaroo.com/test_datas.json?key=a7252f70&__method=POST");
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		String outputString = IOUtils.toString(conn.getInputStream());
		
		String[] StringArray1 = outputString.substring(1, outputString.length()-1).split(",");    
		
       for(int i=0;i<StringArray1.length;i++) {
    	   al1.add(StringArray1[i].replaceAll("\"",""));
       }
		System.out.println(al1);
		}catch(IOException e) {
			System.out.println(e);	
		}
	}
}
