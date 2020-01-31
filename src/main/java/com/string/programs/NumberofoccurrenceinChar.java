package com.string.programs;
import java.util.*;
public class NumberofoccurrenceinChar {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s2 = s1.next();
		char[] ch = s2.toCharArray();
		for(char c='a';c<='z';c++) {
			int count = 0;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]==c) {
					count++;
				}
			}
			if(count==0) {
				continue;
			}else {
				System.out.println(c + " is Character Occuence is : " + count);
			}
		}
	}
}
