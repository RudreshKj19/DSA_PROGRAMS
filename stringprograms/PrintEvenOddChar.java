package com.rc.stringprograms;

public class PrintEvenOddChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Welcome";
		
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				System.out.print(str.charAt(i)+" ");
			}
		}
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				System.out.print(str.charAt(i)+" ");
			}
		}

	}

}
