package com.rc.array;

public class SumofRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 10, 15, 20, 25, 30, 35 };

		int m = 15;
		int n = 30;

		int result = sumOfRange(ar, m, n);
		System.out.println("Sum of Elements b/w 15 and 30: " + result);

	}

	public static int sumOfRange(int[] arr, int m, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= m && arr[i] <= n)
				sum = sum + arr[i];
		}
		return sum;
	}

}
