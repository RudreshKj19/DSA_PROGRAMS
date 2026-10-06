package com.rc.stringprograms;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome home";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			count++;
		}
		System.out.println("Length of the String: "+count);

	}

}
