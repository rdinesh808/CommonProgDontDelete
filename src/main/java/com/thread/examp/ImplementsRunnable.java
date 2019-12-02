package com.thread.examp;

public class ImplementsRunnable implements Runnable{
	public void run() {
		System.out.println("Runnable Interface..");
	}
public static void main(String[] args) {
	ImplementsRunnable ir = new ImplementsRunnable();
	Thread t1 = new Thread(ir);
	t1.start();
}
}
