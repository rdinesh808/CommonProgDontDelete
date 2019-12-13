package com.logicalprog;

import java.util.Arrays;

public class PrintNonRepeatedElementinArray {
public static void main(String[] args) {
	int n[] = {1,2,2,3,3,4,4,7};
    System.out.println("Non Repeating element in array");
    for(int i=0;i<n.length;i++){
      int count=0;
       for (int j = 0; j < n.length; j++){
          if(n[i]==n[j] && i!=j)
                count++;
       }
    if(count==0)
        System.out.print(n[i]+" ");
   }
}
}
