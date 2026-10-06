package com.rc.string;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome";
		String s2 = "welcome";
		String s3 = new String("hello");
		System.out.println("length method: "+s1.length());//7
		System.out.println("length method: "+s3.length());//5
		System.out.println("equals method compare content: "+s1.equals(s2));//false
		System.out.println("compare object address: "+s1==s3);//false
		System.out.println("equalsIgnoreCase method: "+s1.equalsIgnoreCase(s2));//true
		System.out.println("toUpperCase method: "+s1.toUpperCase());//WELCOME
		System.out.println("toLowerCase method: "+s1.toLowerCase());//welcome
		System.out.println("charAt method: "+s1.charAt(6));//e
		
		String s4="hello";
		System.out.println("indexOf method: "+s4.indexOf('l'));//2
		System.out.println("lastIndexOf method: "+s4.lastIndexOf('l'));//3
		System.out.println("indexOf method(startIndex): "+s4.indexOf('l', 3));//3
		System.out.println("lastIndexOf method(startIndex): "+s4.lastIndexOf('l', 3));//3
		
		String s5="welcomecome";
		System.out.println("indexOf substr method: "+s5.indexOf("come"));//3
		System.out.println("lastindexOf substr method: "+s5.lastIndexOf("come"));//7
		System.out.println("contains method: "+s1.contains("come"));//true
		System.out.println("startsWith method: "+s2.startsWith("wel"));//true
		System.out.println("endsWith method: "+s2.endsWith("come"));//true
		
		String s6 ="";
		System.out.println("isEmpty method: "+s6.isEmpty());//true
		System.out.println("Concat method: "+s2.concat("java"));//welcomejava
//		System.out.println(s2);
		
		String s7 = "welcome";
		System.out.println("Substring: "+s7.substring(1, 4));
		
		System.out.println("Repeat Method: "+s7.repeat(2));
		
		System.out.println("String replace: "+s7.replaceFirst("come", "said"));
		
		String str = "  Welcome to java  ";
		System.out.println("Trim method: "+str.trim());
		
		String s = " HII ";
		System.out.println("Strip Leading: "+s.stripLeading());
		System.out.println("Strip Trailing: "+s.stripTrailing());
		
		char[] ch = s7.toCharArray();
		System.out.println("String to Chars: ");
		for(char c : ch) {
			System.out.println(c);
		}
		
		System.out.println("Sub Sequence: "+s7.subSequence(1, 3));
		
		String st = "Welcome/to/java";
		String[] res = st.split("/");
		System.out.println("Split method with delimeters: ");
		for(String str1:res) {
			System.out.println(str1);
		}
		System.out.println();
	}

}
