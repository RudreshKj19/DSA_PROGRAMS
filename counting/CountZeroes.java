package com.rc.counting;

public class CountZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,0,64,0,12,0};
		
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				count++;
			}
		}
		System.out.println("Count of 0s in an Array: "+count);

	}

}
