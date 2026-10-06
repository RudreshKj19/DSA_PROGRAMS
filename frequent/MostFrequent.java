package com.rc.frequent;

public class MostFrequent {
	
	
	    public static int mostFreq(int[] arr) {

	        int freq = 0;
	        int ele = 0;

	        for (int i = 0; i < arr.length; i++) {

	            int count = 0;

	            for (int j = 0; j < arr.length; j++) {

	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }

	            if (count > freq) {
	                ele = arr[i];
	                freq = count;
	            }
	        }

	        return ele;
	    }

	    public static void main(String[] args) {

	        int arr[] = {10, 20, 30, 40, 20, 20, 10};

	        int res = mostFreq(arr);

	        System.out.println(res);
	    }
	}


