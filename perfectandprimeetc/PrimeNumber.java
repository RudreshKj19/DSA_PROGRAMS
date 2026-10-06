package com.rc.perfectandprimeetc;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,3,7,6,13,11};
		
		int primecount=0;
		System.out.print("Prime Numbers: ");
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j=2;j<=ar[i]/2;j++) {
			if(ar[i]%j==0) {
				count++;
				break;
			}
		}
			
			if(count==0) {
				System.out.print(ar[i]+" ");
				
				primecount++;
			}
		
	}
		System.out.println();
		System.out.println("Count of primeNumbers: "+primecount);

	}

}
