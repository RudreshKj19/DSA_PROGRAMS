package com.rc.secondlargest;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {34,67,24,56,89,58};
		int largest=ar[0];
		int secondLargest=ar[1];
		
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
				secondLargest=largest;
			}
			else if(ar[i]>secondLargest) {
				secondLargest=ar[i];
			}
				
		}
		System.out.println("SecondLargest: "+secondLargest);
		
		

	}

}
