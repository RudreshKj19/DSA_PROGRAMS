package com.rc.stringprograms;

public class StringLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char[] ch = str.toCharArray();
			count++;
		}
		System.out.println("Length of the String: "+count);
	}

}
