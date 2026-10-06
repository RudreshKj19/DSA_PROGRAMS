package com.rc.stringprograms;

public class StringEvenOddChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		
		System.out.println("Even Chars: ");
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				System.out.println(str.charAt(i));
			}
			
		}
		System.out.println("Odd Chars: ");
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				System.out.println(str.charAt(i));
			}
		}
	}

}
