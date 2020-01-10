package com.virtusa.programs;

import java.util.Scanner;

public class WordSortngProgram {
	public static void main(String[] args) {
        String names[] = {"house","man","tiger","fish"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j])>0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
