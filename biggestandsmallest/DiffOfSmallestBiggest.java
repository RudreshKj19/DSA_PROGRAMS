package com.rc.biggestandsmallest;

public class DiffOfSmallestBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,84,56,32};
		int dif = getDiffOfBiggestSmallest(ar);
		System.out.println("Difference b/w Biggest and Smallest Element is: "+dif);

	}
	
	public static int getDiffOfBiggestSmallest(int[] x) {
		int max = x[0];
		int min = x[0];
		int difference;
		for(int i=1;i<x.length;i++) {
			if(x[i]>max)
				max=x[i];
			
			if(x[i]<min)
				min=x[i];
		}
		difference = max-min;
		return difference;
		
	}

}


