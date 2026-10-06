package com.rc.twoarray;

import java.util.Arrays;

public class ArrayIntersection {
	

	    public static int[] intersection(int[] x, int[] y) {

	        int[] z = new int[x.length + y.length];
	        int k = 0;

	        for (int i = 0; i < x.length; i++) {

	            boolean common = false;

	            // Check whether x[i] is present in y
	            for (int j = 0; j < y.length; j++) {

	                if (x[i] == y[j]) {
	                    common = true;
	                    break;
	                }
	            }

	            if (common) {

	                boolean present = true;

	                // Avoid duplicate elements
	                for (int j = 0; j < k; j++) {

	                    if (x[i] == z[j]) {
	                        present = false;
	                        break;
	                    }
	                }

	                if (present) {
	                    z[k++] = x[i];
	                }
	            }
	        }

	        // Create exact-size result array
	        int[] rs = new int[k];

	        for (int j = 0; j < k; j++) {
	            rs[j] = z[j];
	        }

	        return rs;
	    }

	    public static void main(String[] args) {

	        int[] x = {10, 20, 30, 40, 20};
	        int[] y = {20, 40, 50, 60};

	        int[] result = intersection(x, y);

	        System.out.println("Intersection of two arrays: "+Arrays.toString(result));
	    }
	}


