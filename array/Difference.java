package com.rc.array;

import java.util.Arrays;

public class Difference {

	public static int[] difference(int[] x,int[] y) {
		int[] z = new int[x.length+y.length];
		int k=0;
		for(int i=0;i<x.length;i++) {
			boolean notcommon=true;
			for(int j=0;j<y.length;j++) {
				if(x[i]==y[j]) {
					notcommon=false;
					break;
				}
			}
			
			if(notcommon) {
				boolean notpresent = true;
				for(int j=0;j<k;j++) {
					if(z[j]==x[i]) {
						notpresent=false;
						break;
					}
				}
				
				if(notpresent)
					z[k++]=x[i];
			}
		}
		
		for(int i=0;i<y.length;i++) {
			boolean notcommon=true;
			for(int j=0;j<x.length;j++) {
				if(y[i]==x[j]) {
					notcommon=false;
					break;
				}
			}
			
			if(notcommon) {
				boolean notpresent = true;
				for(int j=0;j<k;j++) {
					if(z[j]==y[i]) {
						notpresent=false;
						break;
					}
				}
				
				if(notpresent)
					z[k++]=y[i];
			}
		}
		
		
		int[] rs = new int[k];
		for(int i=0;i<rs.length;i++) {
			rs[i]=z[i];
		}
		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = {10,20,30,40,50};
		
		int[] ar2 = {80,90,60};
		
		int[] res = difference(ar1,ar2);
		
		System.out.println(Arrays.toString(res));

	}

}
