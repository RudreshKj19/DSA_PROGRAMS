package com.rc.numberconversion;

public class Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		octal(83);

	}
	public static void octal(int n) {
		int temp = n;
		if(n<0)
			n=n*-1;
		String res = "";
		while(n>0) {
		int rem = n%8;
		n=n/8;
		res=rem+res;
				
		}
		if(temp<0)
			System.out.println("-"+res);
		else
			System.out.println(res);
	}
	

}
