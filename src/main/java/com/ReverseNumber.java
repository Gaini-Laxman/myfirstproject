package com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		//1. using algorithm

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number :");

		int num = sc.nextInt();
//		int rev = 0;
//		
//		while(num!=0) {
//			
//			rev = rev*10 + num%10;
//			num= num/10;
//		
//			
//		}
//		System.out.println(rev);

		// 2.Using String Buffer

//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		
//		System.out.println(rev);

		// 3. Using String Builder

		StringBuilder sb = new StringBuilder(num);
	
		sb.append(num);
		
		StringBuilder rev = sb.reverse();

		System.out.println(rev);

	}

}
