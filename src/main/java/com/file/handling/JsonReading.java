package com.file.handling;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.protobuf.TextFormat.ParseException;

public class JsonReading {
	protected static JSONObject getDataFile(String dataFileName) {
	    String dataFilePath = "../CommonProgramFileRead/Data/";
	    JSONObject testObject = null;
	    try {
	        FileReader reader = new FileReader(dataFilePath + dataFileName);                        
	        JSONParser jsonParser = new JSONParser();
	        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
	        testObject = (JSONObject) jsonObject;
	        String s1 = String.valueOf(testObject);
	        String user = (String) testObject.get("username");
	        System.out.println(user);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return testObject;
	}
	public static void main(String[] args) {
		getDataFile("TestFile.json");
	}
}
