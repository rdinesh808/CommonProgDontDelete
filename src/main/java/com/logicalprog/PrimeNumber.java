package com.logicalprog;

public class PrimeNumber {
	public static void main(String[] args) {
	    String prime = "";
		for(int i=1; i<=10; i++) {
	       int count = 0;
	       for(int num=i; num>=1; num--) {
		if(i%num==0) {
			count = count + 1;
		}
	  }
	       if(count ==2) {
	    	   prime += i + " ";
	       }
    }
		System.out.println("Prime Numers are:");
		System.out.println(prime);
	}
}
