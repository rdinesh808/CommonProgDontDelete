package com.string.programs;
import java.util.*;
public class ConvertOddNumbertoEvenNumber {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	String[] evenodd = {" number is even", " number is odd"};
	
//	for(int i = 0; i < 10; i++){
//	    int x = i;
//	    while (x > 1) 
//	    x = x - 2;
//	    System.out.println(i + evenodd[x]);
//	}
	
	System.out.print("Enter the Number : ");
	int n = s1.nextInt();
	//while(n>0) {
		if(n%2==0) {
			System.out.println(n + evenodd[(n%2)+1]);
		}else {
			System.out.println(n + evenodd[(n%2)-1]);
		//}
		//break;
	}
}
}
