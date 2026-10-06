package com.rc.sumprblms;

public class SumofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,64,89,12,32};
		
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				evensum=evensum+ar[i];
			}
			else {
				oddsum=oddsum+ar[i];
			}
		}
		System.out.println("Sum of Even array elements: "+evensum);
		System.out.println("Sum of Odd array elements: "+oddsum);

	}

}
