package com.rc.perfectandprimeetc;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {28,6,56,49,88};
		int count=0;
		
		System.out.print("Perfect Numbers: ");
		for(int i=0;i<ar.length;i++) {
			
			int sum=0;
			
			for(int j=1;j<=ar[i]/2;j++) {
				if(ar[i]%j==0) {
					sum=sum+j;
				}
				
			}
			if(sum==ar[i]) {
				System.out.print(ar[i]+" ");
				count++;
			}
		}
		
		System.out.println();
		System.out.println("Count of PerfectNumbers: "+count);

	}

}
