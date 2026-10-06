package com.rc.stringprograms;

public class SeperateCharDigSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcometo123@#";
		String alpha = "";
		String digit = "";
		String special = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				alpha = alpha + ch;
			} else if (ch >= '0' && ch <= '9') {
				digit += ch;
			} else {
				special += ch;
			}
		}
		System.out.println("Alphabets: " + alpha);
		System.out.println("Digits: " + digit);
		System.out.println("Special Chars: " + special);
	}

}
