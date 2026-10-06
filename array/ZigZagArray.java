package com.rc.array;

import java.util.Arrays;

public class ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {23,56,78,89};
		
		int[] b = {50,30,58};
		
		int[] c = zigZag(a,b);
		System.out.println(Arrays.toString(c));

	}
	public static int[] zigZag(int[] a,int[] b) {
		
		int[] c = new int[a.length+b.length];
		int j=0;
		for(int i=0;i<c.length;i++) {
			
			if(j<a.length) {
				c[i]=a[j];
				i++;
			}
			if(j<b.length) {
				c[i]=b[j];
			}
			j++;
		}
		return c;
	}

}
