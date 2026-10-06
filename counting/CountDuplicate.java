package com.rc.counting;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {4, 5, 1, 1, 4, 5,2};
		
		int ct=printDuplicateEle(ar);
		System.out.println("Num of Duplicate Ele: "+ct);

	}
	
	public static int printDuplicateEle(int[] arr) {
		int ct=0;
		
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
			ct++;
			}
	}
	return ct;
	
  }
}

	
