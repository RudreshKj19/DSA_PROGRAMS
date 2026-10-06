package com.rc.stringprograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="GADAG";
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		System.out.println("Reverse the String: "+res);
		
		if(str.equals(res)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
