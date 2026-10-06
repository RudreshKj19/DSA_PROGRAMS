package com.rc.matrixprograms;

import java.util.Iterator;
import java.util.Scanner;

public class SumOfMatrixProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the No of Columns: ");
		int col = sc.nextInt();
		int[][] m1 = new int[rows][col];
		int[][] m2 = new int[rows][col];
		int[][] res = new int[rows][col];
		System.out.println("Enter First Matrix: ");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {
				
				m1[i][j] = sc.nextInt();
			}

		}
		System.out.println("Enter Second Matrix: ");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {
				
				m2[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < col; j++) {
				res[i][j] = m1[i][j]+m2[i][j];
			}
		}

		System.out.println("Sum of the two Matrices: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
