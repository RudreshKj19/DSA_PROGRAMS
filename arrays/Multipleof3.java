package com.rc.arrays;

public class Multipleof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {27,45,64,89,12,30};
		int count=0;
		System.out.print("Multiple of 3s:");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%3==0) {
				System.out.print(ar[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of Multiple of 3s:"+count);
		

	}

}
