package com.file.handling;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead_1 {
public static void main(String[] args) throws Exception, ParseException {
	JSONParser jsonParser = new JSONParser();
	FileReader reader = new FileReader("../CommonProgramFileRead/Data/TestFile.json");
	//Read JSON file
	Object obj = jsonParser.parse(reader);
	JSONArray usersList = (JSONArray) obj;
	System.out.println(usersList);
	

for(int i=0;i<usersList.size();i++) 
{
JSONObject users = (JSONObject) usersList.get(i);
System.out.println(users);//This prints every block - one json object
JSONObject user = (JSONObject) users.get("users");
System.out.println(user); //This prints each data in the block
String username = (String) user.get("username");
String password = (String) user.get("password");
  System.out.println("The username in JSON is -> "+username);
  System.out.println("The password in JSON is -> "+password);
}
}
}
