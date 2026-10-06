package com.rc.arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {23,45,65,78,12};//declaration and intialization
		System.out.println("Address :"+a);//address
		System.out.println(a[0]);//accessing
		System.out.println("Length of the array :"+a.length);//length of the array
		System.out.println(a[1]);//45
		System.out.println();
		
		int[] b;//declaration
		b=new int[5];//allocation
//		b = new int[] {24,45,56,6};//initialization
		System.out.println(b[0]);//0
		
		b[0] = 24;//initialization
		b[1] = 45;
		b[2] = 56;
		b[3] = 6;
		b[4] = 3;
		System.out.println("B Array elements: ");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
//		int[] x,y,z;// all three are array type
//		int []p,q,r;// all three are array type
//		int d[],e,f;// d is array type	
//		int j,[]k,l;//CTE
//		int g,h[],i[];//h and i are array type
//		int m,n,[]o;//CTE
//		int[] s,v[],t;// s and t are a single dimension and v is two dimension.

	}

}
