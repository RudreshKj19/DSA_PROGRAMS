package com.rc.sorting;

public class IsSortedInAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,30,40,50};
		
		System.out.println(isSortedInAsc(ar));
		

	}
	
	public static boolean isSortedInAsc(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i])
				return false;
		}
		return true;
	}

}
