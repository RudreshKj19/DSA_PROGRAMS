package com.rc.stringprograms;

public class SeperateCharDigSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome123@$4";
		String chars = "";
		String dig = "";
		String special = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A'&& ch<='Z'|| ch>='a' && ch<='z') {
				chars = chars+ch;
			} else if(ch>='0'&&ch<='9') {
				dig = dig+ch;
			}else {
				special = special+ch;
			}
		}
		System.out.println("Chars: "+chars);
		System.out.println("Digits: "+dig);
		System.out.println("Special Chars: "+special);

	}

}
