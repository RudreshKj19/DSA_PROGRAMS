package com.rc.biggestandsmallest;

public class BiggestandSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 10, 15, 20, 25, 30, 5 };
		
		int[] big = getBiggestandSmallest(ar);
		System.out.println("Biggest Element of an Array: "+big[0]);
		System.out.println("Smallest Element of an Array: "+big[1]);

	}
	
	public static int[] getBiggestandSmallest(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			
			if(arr[i]<min)
				min=arr[i];
		}
		int get[] = {max,min};
		return get;
		
	}

}
