package com.rc.string;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println("before appending String: "+sb);
		sb.append(" to java");
		System.out.println("after appending String: "+sb);
		
		StringBuffer sb1 = new StringBuffer("Hello World");
		System.out.println("before inserting: "+sb1);
		sb1.insert(1, 'b');
		System.out.println("After Inserting: "+sb1);
		
		StringBuffer sb3 = new StringBuffer("GoodMorning");
		System.out.println("before delete: "+sb3);//delete specified part of string
		sb3.delete(1, 4);
		System.out.println("After delete: "+sb3);
		
		StringBuffer sb4 = new StringBuffer("Hello World");
		System.out.println("before deleting: "+sb4);//delete specified char
		sb4.deleteCharAt(4);
		System.out.println("After deleting: "+sb4);
		
		StringBuffer sb5 = new StringBuffer("welcome");
		System.out.println("Capacity: "+sb5.capacity());
		
		StringBuffer sb6 = new StringBuffer("hello");
		sb6.reverse();
		System.out.println("reverse: "+sb6);
	}

}
