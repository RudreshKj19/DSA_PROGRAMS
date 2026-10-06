package com.rc.sorting;

public class SortinDsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] ar = {10,20,15,40,50};
		
		System.out.println(isSortedInDsc(ar));

	}
	
	public static boolean isSortedInDsc(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1]<arr[i])
				return false;
		}
		return true;
	}

}
