package com.rc.matrixprograms;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the No of Columns: ");
		int col = sc.nextInt();
		int[][] m1 = new int[rows][col];
		int[][] res = new int[rows][col];
		System.out.println("Enter the Matrix: ");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {
				m1[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = m1[j][i];
			}
		}

		System.out.println("Transpose Matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(res[i][j] +" ");
			}
			System.out.println();
		}

	}

}
