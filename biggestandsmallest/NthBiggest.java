package com.rc.biggestandsmallest;

public class NthBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {28,56,98,65,32,45};
		
		int big = getNthBiggest(arr,4);
		System.out.println("Nth Biggest Element in the Array: "+big);

	}
	
	public static int getNthBiggest(int[] ar,int n) {
		
		for(int i=0;i<ar.length;i++) {
			int count = 0;
			
			for(int j=0;j<ar.length;j++) {
				if(ar[i]>ar[j])
					count++;
			}
			
			if(count==n-1)
				return ar[i];
		}
		return -1;
	}

}
