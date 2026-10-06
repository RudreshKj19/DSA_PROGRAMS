package com.rc.frequency;

public class DigitFrequency {
	
	public static void printFrequency(int num) {
		int[] count = new int[10];
		
		while(num>0) {
			
			int digit = num%10;
			count[digit]++;
			num/=10;
			
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0)
				System.out.println("Digit "+i+": "+count[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1223334;
		
		printFrequency(num);

	}

}
