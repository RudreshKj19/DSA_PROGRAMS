package com.rc.arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		for(int i=0;i<ar.length;i++) {
			ar[i]=9-i;
		}
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=ar[9-i];
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
