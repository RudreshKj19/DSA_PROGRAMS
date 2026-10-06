package com.rc.matrixprograms;

import java.util.Scanner;

public class IndexOfElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int element = 60;
		boolean found=false;
		
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {
				
				if(arr[i][j] == element) {
					found=true;
					System.out.println("Index of an element: "+i+" row"+" "+j+" col");
				}
			}
			
		}
		
		if(!found) {
			System.out.println("Element not found");
		}
	}

}
