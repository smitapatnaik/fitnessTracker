
package com.patnaik.programmingTests;

public class Multiplier {

	public static void main(String[] args) {
		System.out.println("Product is "+multiply(12,12));
	}

	static int multiply(int x, int y) {
		if (y == 1) {
			return x;
		}
		return multiply(x, y-1) + x;
	}
}
