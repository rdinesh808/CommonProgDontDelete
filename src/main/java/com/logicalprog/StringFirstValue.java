package com.logicalprog;
import java.util.*;
public class StringFirstValue {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter any sentence: ");
    String s1 = s.nextLine();
    s1 = " "+s1;
    for (int i = 0; i < s1.length(); i++) {
        char x = s1.charAt(i);
        if (x == ' ')
            System.out.print(s1.charAt(i + 1));
    }
}
}
