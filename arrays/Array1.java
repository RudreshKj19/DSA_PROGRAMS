
package com.rc.arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter " + n + " values: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("User Entered Array Elements are: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + "->" + ar[i]);
		}

	}

}
