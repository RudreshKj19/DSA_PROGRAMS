package com.rc.biggestandsmallest;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,40,20,30,50};
		
		int result = thirdBiggest(ar);
		System.out.println("ThirdLargest Element in the Array: "+result);

	}
	
	public static int thirdBiggest(int[] arr) {
		int fbig=arr[0];
		int sbig = arr[1];
		int tbig=arr[2];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>fbig) {
				tbig = sbig;
				sbig = fbig;
				fbig = arr[i];
			}
			else if(arr[i]>sbig && arr[i]!= fbig) {
				tbig = sbig;
				sbig = arr[i];	
			}
			else if(arr[i]>tbig && arr[i]!=fbig && arr[i]!=sbig) {
				tbig = arr[i];
			}
			
		}
		return tbig;
	}

}
