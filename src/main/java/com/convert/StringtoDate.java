package com.convert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate {
public static void main(String[] args) throws Exception {
	String testDateString = "02/04/2014";
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Date d1 = df.parse(testDateString);
	
	DateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy");
	String s1 = df1.format(d1);
	System.out.println(s1);
    //System.out.println("Date in dd/MM/yyyy format is: "+df.format(d1));
    
	
	
    String testDateString3 = "02-Apr-2014";
    DateFormat df3 = new SimpleDateFormat("dd-MMM-yyyy");
    Date d3 = df3.parse(testDateString3);
    
    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
    String s2 = df2.format(d3);
    System.out.println(s2);
    //System.out.println("Date in dd-MMM-yyyy format is: "+df3.format(d3));
}
}
