package com.rc.array;

import java.util.Arrays;

public class MoveZeroToBeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,0,20,0,0,30,40,0};
		
		moveZeroToBeg(ar);
		
		System.out.println(Arrays.toString(ar));

	}
	
	public static void moveZeroToBeg(int[] ar) {
		
		int index=ar.length-1;
		
		for(int i=index;i>=0;i--) {
			if(ar[i]!=0) {
				ar[index]=ar[i];
				index--;
			}
		}
			
			while(index>=0) {
				ar[index]=0;
				index--;
			}
		}
	}


