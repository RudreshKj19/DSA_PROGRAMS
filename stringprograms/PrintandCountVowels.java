package com.rc.stringprograms;

public class PrintandCountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		int vowelcount=0;
		System.out.println("Vowels: ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
				vowelcount++;
			}
		}
		System.out.println("Vowel Count: "+vowelcount);

	}

}
