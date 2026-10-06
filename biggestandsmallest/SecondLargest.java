package com.rc.biggestandsmallest;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,25,50,40,30};
		
		int result = secondLargest(ar);
		System.out.println("Second Largest Element in the Array: "+result);
	}
	public static int secondLargest(int[] arr) {
		int largest = arr[0];
		int secondLar=arr[1];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLar = largest;
				largest = arr[i];	
			}
			else if(arr[i]>secondLar && arr[i]!=largest)
			
				secondLar = arr[i];
				
			
		}
		return secondLar;
	}

}
