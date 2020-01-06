package com.thread.examp;

// The join() method is used to hold the execution of currently running thread until the specified thread is dead(finished execution).

public class ThreadJoin extends Thread {
	 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
	}  
	 public static void main(String[] args) throws Exception {
		 ThreadJoin tj1 = new ThreadJoin();
		 ThreadJoin tj2 = new ThreadJoin();
		 ThreadJoin tj3 = new ThreadJoin();
		 tj1.start();
         System.out.println("TJ1");
		 tj1.join();
		 tj2.start();
		 System.out.println("TJ2");
		 tj2.join();
		 tj3.start();
		 System.out.println("TJ3");
	}
}
