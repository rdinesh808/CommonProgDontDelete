package com.logicalprog;

public class printnonrepeatingCharacter {
	public static void main(String[] args){
        String s1 = "java";
        char[] ch = s1.toCharArray();
        System.out.println("Non Repeating Character is :");
        for(int i=0;i<=ch.length-1;i++) {
        	int count = 0;
        	for(int j=0;j<=ch.length-1;j++) {
        		if(ch[i]==ch[j] && i!=j)
                    count++;
           }
        	if(count==0)
                System.out.print(ch[i]);
        }
    }      
}
