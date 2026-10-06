package com.rc.array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {10,20,30,20,40,20,30,50};
		
		int[] res = removeDuplicate(ar);
		System.out.println(Arrays.toString(res));
	
	}
	
	public static int[] removeDuplicate(int[] x) {
		int[] y = new int[x.length];
		int k=0;
		for(int i=0;i<x.length;i++) {
			boolean present = false;
			for(int j=0;j<k;j++) {
				if(x[i]==y[j]) {
					present=true;
					break;
				}
			}
			if(present)
				continue;
			
			y[k++] = x[i];
		}
		
		x = new int[k];
		
		for(int i=0;i<k;i++){
			x[i] = y[i];
			
			
		}
		return x;
	}

}
