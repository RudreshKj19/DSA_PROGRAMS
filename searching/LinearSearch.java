package com.rc.searching;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 25, 35, 46, 28, 78 };

		int index = linearSearch(ar, 46);
		if (index == -1)
			System.out.println("Not present at index");
		else
			System.out.println("Present at index " + index);

	}

	static int linearSearch(int[] arr, int target) // firstOccurence index
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

}
