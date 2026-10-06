package com.rc.matrixprograms;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the No of rows: ");
//		int rows = sc.nextInt();
//		System.out.println("Enter the No of col: ");
//		int col = sc.nextInt();
		int[][] arr = { {10,20,30},
						{40,50,60},
						{70,80,90}};
		
		
		
		
	
		
//		System.out.println("Enter the Matrix: ");
//		for (int i = 0; i < rows; i++) {
//
//			for (int j = 0; j < col; j++) {
//				
//				arr[i][j] = sc.nextInt();
//			}
//
//		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int max = arr[0][0];
		
		for (int i = 1; i < arr.length; i++) {

			for (int j = 1; j < arr[i].length; j++) {
				
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		
		System.out.println("Largest element in the matrix: "+max);
	}

}
