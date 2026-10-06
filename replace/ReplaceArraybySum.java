package com.rc.replace;

import java.util.Arrays;

public class ReplaceArraybySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,64,89,12,32};
		
		for(int i=0;i<ar.length;i++) {
			
			int temp = ar[i];
			int sum=0;
			
			while(temp>0) {
				int digit = temp%10;
				sum = sum+digit;
				temp=temp/10;
			}
			ar[i]=sum;
		}
		
		System.out.println(Arrays.toString(ar));	

	}

}
