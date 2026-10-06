package com.rc.array;

import java.util.Arrays;

public class InsertElement {
	
	public static int[] insertEle(int[] x,int ele,int index) {
		
		if(index<0 || index>x.length) {
			System.out.println("Not possible to insert");
			return x;
		}
		
		int[] z = new int[x.length+1];
		
		for(int i=0;i<index;i++) {
			z[i]=x[i];
		}
		
		z[index]=ele;
		
		for(int i=index;i<x.length;i++) {
			z[i+1]=x[i];
		}
		
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,30,40,50};
		
		int ele = 25;
		int index = 2;
		
		int[] res = insertEle(ar,ele,index);
		
		System.out.println(Arrays.toString(res));

	}

}
