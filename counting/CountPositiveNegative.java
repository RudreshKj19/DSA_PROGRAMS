package com.rc.counting;

public class CountPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {23,-45,64,89,12,-32};
		
		int positivecount=0;
		int negativecount=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>0) 
				positivecount++;
			else
				negativecount++;
		}
		System.out.println("Count of Positive Array Elements: "+positivecount);
		System.out.println("Count of Negative Array Elements: "+negativecount);

	}

}
