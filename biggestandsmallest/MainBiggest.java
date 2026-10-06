package com.rc.biggestandsmallest;

public class MainBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,84,88,32};
		int big = getBiggest(ar);
		System.out.println("Biggest Array Element: "+big);

	}
	
	public static int getBiggest(int[] x) {
		int max = x[0];
		for(int i=1;i<x.length;i++) {
			if(x[i]>max)
				max=x[i];
		}
		return max;
	}

}
