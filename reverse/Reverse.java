package com.rc.reverse;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,84,56,32};
		System.out.println("Array Elements: "+Arrays.toString(ar));
		reverse(ar);
		System.out.println("Rverse Array Elements:"+Arrays.toString(ar));
		

	}
	
	public static void reverse(int[] x) {
		int left = 0,right=x.length-1;
		while(left<right) {
			int temp = x[left];
			x[left]=x[right];
			x[right]=temp;
			left++;
			right--;
		}
	}

}
