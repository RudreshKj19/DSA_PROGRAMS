package com.rc.biggestandsmallest;

public class PrimeNum {

	
	public static int countPrime(int[] arr) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i]))
				count++;
		}
		return count;
	}
	
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
	return true;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int ar[] = {2,7,3,21,35};
	
	int prime = countPrime(ar);
	System.out.println("Count of Prime Numbers: "+prime);

	}
}




			
