package com.rc.reverse;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,64,89,12,32};
		
		reverseArray(ar);
		
	}
		
		
		public static void reverseArray(int[] arr) {
	
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		

	}

}
