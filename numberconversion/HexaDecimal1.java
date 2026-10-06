package com.rc.numberconversion;

public class HexaDecimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int on=1564;
		String helper = "0123456789ABCCDEF";
		String res ="";
		while(on>0) {
		int rem = on%16;
		if(rem<=9) { 
			res = rem + res;
			}
			else {
				res = helper.charAt(rem)+res;	
				}
		on = on/16;
		}
		System.out.println(res);
	}

	}


