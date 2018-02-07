package com.patnaik.programmingTests;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Product is "+factorial(99));
	}
	
	static double factorial(double n) {
		if (n == 1)
			return 1;
		return factorial(n-1) * n;
	}
}
