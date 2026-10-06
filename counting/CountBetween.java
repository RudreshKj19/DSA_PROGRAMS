package com.rc.counting;

public class CountBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 15, 20, 25, 30, 35 };
		int m = 15;
		int n = 30;

		int result = countElements(arr, m, n);
		System.out.println("Count Elements b/w 15 and 30: " + result);

	}

	static int countElements(int[] ar, int m, int n) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= m && ar[i] <= n)
				count++;
		}
		return count;
	}
}
