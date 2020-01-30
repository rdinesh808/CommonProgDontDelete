package com.mockaroo.read;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.*;
import org.apache.commons.io.IOUtils;

public class Mockaroo_Read_One {
public static void main(String[] args) {
	Map<String, String> RandomValues = new LinkedHashMap<String, String>();
	try {
	URL url = new URL("https://my.api.mockaroo.com/test_datas.json?key=a7252f70&__method=POST");
	
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	
	String outputString = IOUtils.toString(conn.getInputStream());
	
	String[] StringArray1 = outputString.substring(1, outputString.length()-1).split(",");    
	
	for (String StringValue : StringArray1) {
		
		String[] StringArray2 = StringValue.split(":");
		
		RandomValues.put(StringArray2[0].trim(),StringArray2[1].replaceAll("\"","").trim());
	}
	System.out.println(RandomValues);
	for(Map.Entry<String, String> m : RandomValues.entrySet()) {
		System.out.println("Key = " + m.getKey().replace("\"", "") + " " + " Value = " + m.getValue());
	}
	
	}catch(IOException e) {
		System.out.println(e);	
	}
}
}
