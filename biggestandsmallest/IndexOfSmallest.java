package com.rc.biggestandsmallest;

public class IndexOfSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {23,15,84,56,32};
		int si = getSmallestElementIndex(ar);
		System.out.println("Smallest Element Index: "+si);
		System.out.println("Smallest Array Element: "+ar[si]);

	}
	
	public static int getSmallestElementIndex(int[] x) {
		int mi =0;
		for(int i=1;i<x.length;i++) {
			if(x[i]<x[mi])
				mi=i;
		}
		return mi;
		
		
	}

}


