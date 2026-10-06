package com.rc.biggestandsmallest;

public class MainSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {23,45,84,15,32};
		int small = getSmallest(ar);
		System.out.println("Smallest Array Element: "+small);

	}
	
	public static int getSmallest(int[] x) {
		int min =x[0];
		for(int i=1;i<x.length;i++) {
			if(x[i]<min)
				min=x[i];
		}
		return min;
		
		
	}

}
