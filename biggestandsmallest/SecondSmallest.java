package com.rc.biggestandsmallest;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,25,50,40,30};
		
		int result = secondSmallest(ar);
		System.out.println("Second Smallest Element in the Array:"+result);

	}
	
	public static int secondSmallest(int[] arr) {
		int fsmall = arr[0];
		int secsmall = arr[1];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<fsmall) {
				secsmall = fsmall;
				fsmall = arr[i];
			}
			else if(arr[i]<secsmall && arr[i]!=fsmall) {
				secsmall = arr[i];
			}
		}
		
		return secsmall;
		
	}

}
