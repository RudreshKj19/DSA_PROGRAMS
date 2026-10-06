package com.rc.array;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,0,20,0,0,30,40,0};
		
		moveZeroToEnd(ar);
		
		System.out.println(Arrays.toString(ar));

	}
	
	public static void moveZeroToEnd(int[] ar) {
		
		int index=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				ar[index]=ar[i];
				index++;
			}
		}
			
			while(index<ar.length) {
				ar[index]=0;
				index++;
			}
		}
	}


