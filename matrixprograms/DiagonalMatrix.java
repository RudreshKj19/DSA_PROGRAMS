package com.rc.matrixprograms;

import java.util.Scanner;

public class DiagonalMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the No of col: ");
		int col = sc.nextInt();
		int[][] arr = new int[rows][col];
		
		
		System.out.println("Enter the Matrix: ");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {
				
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("Diagonal Matrix: ");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {
				
				if(i==j) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}

}
