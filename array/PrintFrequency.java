package com.rc.array;

import java.util.Arrays;

public class PrintFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,10,20,30,40};
		
		printFrequency(ar);
		
		
	}
	
	public static void printFrequency(int[] ar) {
		
		int max=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max)
				max=ar[i];
		}
		
		int[] count = new int[max+1];
		for(int i=0;i<ar.length;i++) {
			count[ar[i]]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0)
			System.out.println(i+"->"+count[i]);
		}
	}

}
