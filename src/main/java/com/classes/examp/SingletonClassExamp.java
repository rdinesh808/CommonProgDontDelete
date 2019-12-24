package com.classes.examp;

public class SingletonClassExamp {
	private static SingletonClassExamp instance = null;
	   private SingletonClassExamp() {
	      // Exists only to defeat instantiation.
	   }

	   public static SingletonClassExamp getInstance() {
	      if(instance == null) {
	         instance = new SingletonClassExamp();
	      }
	      return instance;
	   }
	   public static void main(String[] args) {
		   SingletonClassExamp sce = SingletonClassExamp.getInstance();
	}
}
