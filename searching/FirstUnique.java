package com.rc.searching;

public class FirstUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {4, 5, 3, 5, 1, 2, 1, 4};
		
		System.out.println("First Uniqe element in the Array is: "+firstUnique(ar));

	}
	
	public static int firstUnique(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j])
					count++;
			}
		
		if(count==1) {
			return arr[i];
			}
	}
	return -1;

  }
}
