package com.rc.biggestandsmallest;

public class ThirdSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,25,40,30,20};
		
		int result = thirdSmallest(ar);
		System.out.println("Third Smallest Element in the Array: "+result);

	}
	
	public static int thirdSmallest(int[] arr) {
		int fsmall=arr[0];
		int secsmall=arr[1];
		int tsmall=arr[2];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<fsmall) {
				tsmall=secsmall;
				secsmall=fsmall;
				fsmall=arr[i];
			}
			else if(arr[i]<secsmall && arr[i]!=fsmall) {
				tsmall=secsmall;
				secsmall=arr[i];
			}
			else if(arr[i]<tsmall && arr[i]!=fsmall && arr[i]!=secsmall && arr[i]!=tsmall) {
				tsmall = arr[i];
			}
		}
		return tsmall;
	}

}
