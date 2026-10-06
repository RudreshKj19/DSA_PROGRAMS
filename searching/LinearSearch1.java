package com.rc.searching;

public class LinearSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 25, 35, 46, 28, 78 };
		int index = linearSearch(ar, 28);
		if (index == -1)
			System.out.println("Not present at index");
		else
			System.out.println("Present at index " + index);

	}

	public static int linearSearch(int[] arr, int target) // lastOccurence index
	{
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

}
