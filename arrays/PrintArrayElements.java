package com.rc.arrays;

import java.util.Arrays;

public class PrintArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] ar = {23,45,67,12,34,56,78,90};
	
	for(int i=0;i<ar.length;i++) {
		if(i<ar.length-1)
			System.out.print(ar[i]+",");
		else
			System.out.println(ar[i]);
	}
	System.out.println("---------------------------------------------");
	for(int ele:ar) {
		System.out.print(ele+" ");
	}
	System.out.println("\n---------------------------------------------");
	System.out.println(Arrays.toString(ar));
	}

}
