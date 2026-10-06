package com.rc.twoarray;

import java.util.Arrays;

public class ArrayUnion {

	public static int[] union(int[] x, int[] y) {

		int[] z = new int[x.length + y.length];

		int k = 0;

		for (int i = 0; i < x.length; i++) {

			boolean res = true;

			for (int j = 0; j < k; j++) {

				if (z[j] == x[i]) {
					res = false;
					break;
				}
			}

			if (res) {
				z[k++] = x[i];
			}
		}

		for (int i = 0; i < y.length; i++) {

			boolean res = true;

			for (int j = 0; j < k; j++) {

				if (z[j] == y[i]) {
					res = false;
					break;
				}
			}

			if (res) {
				z[k++] = y[i];
			}
		}

		int[] rs = new int[k];

		for (int i = 0; i < k; i++) {
			rs[i] = z[i];
		}

		return rs;
	}

	public static void main(String[] args) {

		int[] x = { 10, 20, 30, 40, 20 };
		int[] y = { 20, 40, 50, 60 };

		int[] result = union(x, y);

		System.out.println("Union of two arrays: " + Arrays.toString(result));
	}
}
