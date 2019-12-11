package com.logicalprog;
import java.util.*;
public class NumericaltoRomanConvert {
	
	public static void integerToRoman(int num) {

        System.out.println("Integer: " + num);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        //StringBuilder roman = new StringBuilder();
        String s1 = "";

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                //roman.append(romanLiterals[i]);
                s1 += romanLiterals[i];
            }
        }
        System.out.println("Roman Letter is : " + s1.toString());
    }
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number..");
	int n = sc.nextInt();
	integerToRoman(n);
}
}
