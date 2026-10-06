package com.rc.frequency;

public class PrinDupicate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {4, 5, 1, 1, 4, 5,2};
		
		printDuplicateEle(ar);

	}
	
	public static void printDuplicateEle(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			boolean visited=false;
			for(int k=i-1;k>=0;k--) {
				if(arr[i]==arr[k]) {
					visited=true;
					break;
				}
			}
			
			if(visited)
				continue;
			
			int count=1;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j])
					count++;
					
			}
		
		if(count>1) {
			System.out.print(arr[i]+" ");
			}
	}
	
  }
}


	
