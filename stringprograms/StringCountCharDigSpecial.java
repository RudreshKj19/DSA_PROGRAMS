package com.rc.stringprograms;

public class StringCountCharDigSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome123@$4";
		int charcnt = 0;
		int digcnt = 0;
		int specialcnt = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A'&& ch<='Z'|| ch>='a' && ch<='z') {
				charcnt++;
			} else if(ch>='0'&&ch<='9') {
				digcnt++;
			}else {
				specialcnt++;
			}
		}
		System.out.println("Chars: "+charcnt);
		System.out.println("Digits: "+digcnt);
		System.out.println("Special Chars: "+specialcnt);


	}

}
