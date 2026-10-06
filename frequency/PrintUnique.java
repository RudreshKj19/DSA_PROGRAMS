package com.rc.frequency;

public class PrintUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {4,5,1,2,3,4,5,6};
		
		printUnique(ar);

	}
	
	public static void printUnique(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			
			if(count==1)
				System.out.print(arr[i]+" ");
				
		}
	}

}
