package com.rc.stringprograms;

public class RemoveOvewls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome";
//		String notovewl="";
		for(char ch:str.toCharArray()) {
//			char ch = str.charAt(i);
			if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' &&
					   ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
					    System.out.print(ch+" ");
					}
		}
//		System.out.println(notovew);

	}

}

//public static void main(String[] args) {
//
//    String str = "Welcome";
//
//    String vowels = "AEIOUaeiou";
//
//    for(int i = 0; i < str.length(); i++) {
//
//        char ch = str.charAt(i);
//
//        if(vowels.indexOf(ch) == -1) {
//            System.out.print(ch + " ");
//        }
//    }
//}
