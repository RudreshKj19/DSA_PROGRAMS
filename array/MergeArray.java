package com.rc.array;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {13,23,45,67};
		int[] b = {24,46,98};
		
		int[] c = merge(a,b);
		System.out.println(Arrays.toString(c));

	}
	
	public static int[] merge(int[] x,int[] y) {
		int[] z = new int[x.length+y.length];
		
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++) {
			z[x.length+i] = y[i];
		}
		return z;
	}

}
