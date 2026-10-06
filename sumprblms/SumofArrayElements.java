package com.rc.sumprblms;

import java.util.Scanner;

public class SumofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter "+n+" Values: ");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			}
		int sum=0;
//		for(int i=0;i<ar.length;i++) {
//			sum=sum+ar[i];
//		}
		
		for(int ele:ar) {
			sum=sum+ele;
		}
		
		System.out.println("Sum of array Elements is: "+sum);

	}

}
