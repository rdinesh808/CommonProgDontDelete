package com.logicalprog;

import java.lang.reflect.Method;

public class MethodNamesGet {
public void one(){
	System.out.println("First  Method");
}
public void two(){
	System.out.println("Second  Method");
}
public void three(){
	System.out.println("Third  Method");
}
public void four(){
	System.out.println("Forth  Method");
}
public void five(){
	System.out.println("Fifth  Method");
}

public static void main(String[] args) {
	 Method[] methods = MethodNamesGet.class.getMethods();
	 for(int i=0;i<=methods.length-1;i++){
		 System.out.println(methods[i].getName());
	 }
}
}
