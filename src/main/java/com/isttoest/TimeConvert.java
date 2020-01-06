package com.isttoest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvert {
	public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter3 = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat formatter4 = new SimpleDateFormat("E, dd MMM yyyy");
        SimpleDateFormat formatter5 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        SimpleDateFormat formatter6 = new SimpleDateFormat("EEEE, MMM dd yyyy, hh:mm:ss a");
        SimpleDateFormat formatter7 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss z");
        SimpleDateFormat formatter8 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss Z");
        System.out.println("Format is : " + formatter1.format(today));
        System.out.println("Format is : " + formatter2.format(today));
        System.out.println("Format is : " + formatter3.format(today));
        System.out.println("Format is : " + formatter4.format(today));
        System.out.println("Format is : " + formatter5.format(today));
        System.out.println("Format is : " + formatter6.format(today));
        System.out.println("Format is : " + formatter7.format(today));
        System.out.println("Format is : " + formatter8.format(today));
    }
}
