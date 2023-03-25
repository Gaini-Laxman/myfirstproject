package com;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before Swapping :" + a + " " + b);

		// 1. using 3rd Variable

//		int t = a;
//		a = b;
//		b = t;
//
//		System.out.println("After Swapping :" + a + " " + b);

		// 2. Using +,- without 3rd variable

//		a = a + b;
//		b = a - b;
//		a = a - b; 
//
//		System.out.println("After Swapping :" + a + " " + b);

		// 3. swapping 2 no. using *,/

//		a = a * b;
//		b = a / b;
//		a = a / b;
//
//		System.out.println("After Swapping :" + a + " " + b);

		// 4. swapping 2 numbers Using ^

//		a = a ^ b;
//		b = a ^ b;
//		a = a ^ b;
//
//		System.out.println("After Swapping :" + a + " " + b);

		// 5. Swapping 2 Numbers Using Single Statement

		b = a + b - (a = b);

		System.out.println("After Swapping :" + a + " " + b);

	}

}
