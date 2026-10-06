package com.rc.arrays;

public class AvgOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,64,89,12,32};
		
		int sum=0;
		int avg=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		avg = sum/ar.length;
		System.out.println("Avg of Array Elements: "+avg);

	}

}
