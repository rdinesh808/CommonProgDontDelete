package com.isttoest;

import java.text.SimpleDateFormat;
import java.util.*;

public class ISTtoESTConvert {
	public static void main(String[] args) throws Exception {
		
		 SimpleDateFormat FORMATTER = new SimpleDateFormat("hh:mm aa z");
		 TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
	     Date currentDate = new Date();
	     FORMATTER.setTimeZone(etTimeZone);
	     String s1 = FORMATTER.format(currentDate);
	     System.out.println(s1); 
	}
}
