package com.rc.array;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 10, 15, 20, 25, 30, 35 };
		
		int[] result = evenOddSum(ar);
		System.out.println("Even Number Sum: "+result[0]);
		System.out.println("Even Number Sum: "+result[1]);
		

	}
	
	public static int[] evenOddSum(int[] arr) {
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				evenSum=evenSum+arr[i];
			else
				oddSum=oddSum+arr[i];
		}
		int sum[] = {evenSum,oddSum};
		return sum;
	}

}
