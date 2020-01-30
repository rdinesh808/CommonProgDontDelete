package com.random;

import java.util.*;

public class RandomNumber_ZipCode {
public static void main(String[] args) {
	
	Random r = new Random();
	
	String input = "12345";
	
	Set<String> identifiers = new HashSet<String>();
	
    StringBuilder builder = new StringBuilder();
    
    while(builder.toString().length() == 0) {
    	
        for(int i = 0; i < 5; i++) {
            builder.append(input.charAt(r.nextInt(input.length())));
        }
        
        if(identifiers.contains(builder.toString())) {
            builder = new StringBuilder();
        }
    }
    System.out.println(builder);
}
}
