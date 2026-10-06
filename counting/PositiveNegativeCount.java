package com.rc.counting;

public class PositiveNegativeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {10,-40,25,-15,45,-10,56};
		
		int[] ct = countPositiveNegative(ar);

		System.out.println("No of Positive Elements: " + ct[0]);
		System.out.println("No of Negative Elements: " + ct[1]);

	}
	
	public static int[] countPositiveNegative(int[] arr) {
		int positive=0;
		int negative=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				positive++;
			else
				negative++;
		}
		int count[] = {positive,negative};
		return count;
	}

}
