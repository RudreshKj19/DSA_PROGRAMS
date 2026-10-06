package com.rc.sorting;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,15,40,50};
		
		System.out.println(isSort(ar));

	}
	
	public static boolean isSort(int[] arr) {
		boolean ascSort = true;
		boolean dscSort = true;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i])
				ascSort=false;
			
			if(arr[i-1]<arr[i])
				dscSort=false;
		}
		return ascSort || dscSort;
	}

}
