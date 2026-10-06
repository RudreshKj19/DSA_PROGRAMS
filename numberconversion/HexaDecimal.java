package com.rc.numberconversion;

public class HexaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int on=75;
		String res ="";
		while(on>0) {
		int rem = on%16;
		if(rem<=9) { 
			res = rem + res;
			}
			else {
				char temp =(char)(rem+55);
				res = temp+res;	
				}
		on = on/16;
		}
		System.out.println(res);
	}
	
}
