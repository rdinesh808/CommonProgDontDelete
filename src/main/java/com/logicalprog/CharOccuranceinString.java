package com.logicalprog;

public class CharOccuranceinString {
public static void main(String[] args) {
	String s1 = "java";
	char[] ch = s1.toCharArray();
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
