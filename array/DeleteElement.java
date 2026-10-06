package com.rc.array;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,30,40,50};
		
		int index=2;
		
		int[] res = delEle(ar,index);
		
		System.out.println(Arrays.toString(res));

	}
	
	public static int[] delEle(int[] x,int index) {
		
		if(index<0 || index>=x.length) {
			System.out.println("Not possible to delete");
			return x;
		}
		
		int[] z = new int[x.length-1];
		
		for(int i=0;i<index;i++) {
			z[i]=x[i];
		}
		
		for(int i=index;i<z.length;i++) {
			z[i]=x[i+1];
		}
		
		return z;
	}

}
