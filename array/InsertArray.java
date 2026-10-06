package com.rc.array;

import java.util.Arrays;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {10,20,30,40,50};
		
		int[] ar2 = {100,200,300};
		
		int index = 2;
		
		int[] res = insertArr(ar1,ar2,index);
		
		System.out.println(Arrays.toString(res));

	}
	
	public static int[] insertArr(int[] ar1,int[] ar2,int index) {
		
//		if(index<0 || index>=ar1.length && index>=ar2.length) {
//			System.out.println("not possible to insert");
//			return
//		}
		
		int[] ar = new int[ar1.length+ar2.length];
		
		for(int i=0;i<index;i++) {
			
			ar[i]=ar1[i];
		}
		
		for(int i=0;i<ar2.length;i++) {
			ar[index+i]=ar2[i];
		}
		for(int i=index;i<ar1.length;i++) {
			ar[i+ar2.length]=ar1[i];
		}
		return ar;
	}

}
