package com.rc.evenorodd;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,45,64,89,12,32};
		
		int evenCount=0;
		int oddCount=0;
		
		for(int ele:ar) {
			if(ele%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			
		}
		
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd Count: "+oddCount);

	}

}
