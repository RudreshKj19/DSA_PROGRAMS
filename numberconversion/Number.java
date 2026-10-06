package com.rc.numberconversion;

public class Number {

	public static void main(String[] args) {

		Decimal(-10);

	}

	public static void Decimal(int n) {
		int temp = n;
		if (n < 0)
			n = n * -1;
		String res = "";
		while (n > 0) {
			int rem = n % 2;
			n = n / 2;
			res = rem + res;

		}
		if (temp < 0)
			System.out.println("-" + res);
		else
			System.out.println(res);
	}

}
