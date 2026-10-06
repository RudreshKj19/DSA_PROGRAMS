package com.rc.stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GadaG";
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println(str+"is palindrome");
		}
		else {
			System.out.println(str+"is Not palindrome");
		}

	}
	

}
