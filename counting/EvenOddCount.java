package com.rc.counting;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 10, 15, 20, 25, 30, 35 };

		int[] ct = countEvenOdd(ar);

		System.out.println("No of Even Elements: " + ct[0]);
		System.out.println("No of Odd Elements: " + ct[1]);

	}

	static int[] countEvenOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		int[] count = { evenCount, oddCount };
		return count;
	}

}
