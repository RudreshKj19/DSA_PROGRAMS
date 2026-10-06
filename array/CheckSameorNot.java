package com.rc.array;

public class CheckSameorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,30,10,50};
		
		
		
		System.out.println(isSameorNot(ar,0,3));

	}
	
	public static boolean isSameorNot(int[] arr,int i0,int i3) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i0]!=arr[i3])
				return false;
		}
		return true;
	}

}
