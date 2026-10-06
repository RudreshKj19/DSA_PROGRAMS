package com.rc.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {22,45,64,11,12,121};
		
		int count=0;
		for(int i=0;i<ar.length;i++) {
			int on=ar[i];
			int reverse=0;
			while(ar[i]>0) {
				int d = ar[i]%10;
				reverse=reverse*10+d;
				ar[i]=ar[i]/10;
		}
			if(on==reverse) {
				count++;
			}
			
	}
		System.out.println("Count of Palindrome: "+count);
		
	}

}
