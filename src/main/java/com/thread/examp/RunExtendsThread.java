package com.thread.examp;

public class RunExtendsThread extends Thread {
	public void run(){  
		System.out.println("Thread Class..");  
		}  
		public static void main(String args[]){  
		RunExtendsThread t1=new RunExtendsThread();  
		t1.start();  
	}  
}
