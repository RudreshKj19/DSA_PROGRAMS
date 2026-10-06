package com.rc.frequency;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 10, 20, 30, 20, 50 };

		int target = 20;
		System.out.println("Count frequency of the target element:" + findFrequency(ar, target));

	}

	static int findFrequency(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				count++;
		}
		return count;
	}

}
