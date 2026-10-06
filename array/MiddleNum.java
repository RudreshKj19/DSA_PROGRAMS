package com.rc.array;

public class MiddleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,40,50,34,45};
		
		int result = getMiddleNum(ar);
		System.out.println("MidNumber: "+result);

	}
	
	public static int getMiddleNum(int[] arr) {
		
		int mid3;
		int mid = arr.length/2; 
		
			if(arr.length%2!=0) {
					return arr[mid];
				}
			else {
				int mid1 = arr[mid-1];
				int mid2 = arr[mid];
				    mid3 = (mid1+mid2)/2;
				}
			return mid3;
	 }
	

}
