package com.datastructure;
import java.util.Vector;
class Solution extends Vector {
public static void main(String args[]){
	Solution s1 = new Solution();
    s1.add(2);
    s1.add(7);
    s1.add(11);
    s1.add(15);
    int sum = (Integer) s1.get(0);
    int sum1 = (Integer) s1.get(1);
    System.out.println((sum+sum1));
}
}