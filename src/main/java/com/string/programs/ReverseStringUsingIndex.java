package com.string.programs;

import java.util.*;
public class ReverseStringUsingIndex {
	public static void main(String args[]) {
	      String str = "New England";
	      StringBuffer sb= new StringBuffer(str);
	      sb.reverse();
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i) == (char)32){
	         sb.insert(i, " ");
	      }
	   }
	   System.out.println(sb);
	}
}
