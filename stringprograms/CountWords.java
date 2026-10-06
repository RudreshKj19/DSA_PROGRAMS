package com.rc.stringprograms;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to the Java world";
		char[] ch = str.toCharArray();
		int wc=0;
		for (int i = 0; i < ch.length; i++) {
			if(i==0 && ch[i]!=' '||ch[i]!=' ' && ch[i-1]==' ') {
				wc++;
			}
		}
		System.out.println("Number of Words: "+wc);
	}

}
