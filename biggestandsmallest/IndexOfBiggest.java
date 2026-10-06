package com.rc.biggestandsmallest;

public class IndexOfBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,84,56,32};
		int bi = getBiggestElementIndex(ar);
		System.out.println("Biggest Element Index: "+bi);
		System.out.println("Biggest Array Element: "+ar[bi]);

	}
	
	public static int getBiggestElementIndex(int[] x) {
		int mi = 0;
		for(int i=1;i<x.length;i++) {
			if(x[i]>x[mi])
				mi=i;
		}
		return mi;
	}

}


