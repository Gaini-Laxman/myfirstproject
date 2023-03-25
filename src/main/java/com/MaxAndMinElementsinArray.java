package com;

public class MaxAndMinElementsinArray {

	public static void main(String[] args) {

		int a[] = { 50, 40, 60, 80, 100, 600 };
		
		//1. Max Array

		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max)
			{
		max=a[i];
	}
}

System.out.println(max);
}
}

		
		//2. Min Array
		
//		int min = a[0];
//		for (int i = 1; i < a.length; i++) {
//
//			if (a[i] < min) {
//				min = a[i];
//			}
//		}
//
//		System.out.println(min);
//	}
//}
