package com.rc.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {23,56,78,89};
		int[] b = {15,30,58};
		
		int[] c = mergeSort(a,b);
		System.out.println(Arrays.toString(c));
 
	}
	public static int[] mergeSort(int[] a,int[] b) {
		int[] c = new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		return c;
	}

}
