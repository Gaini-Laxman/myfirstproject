package com;

public class ReverseString {

	// 1.using + (string concatenation) operator
	/**
	 * @param args
	 */
	public static void main(String args[]) {

		String str = "Laxman";
		String rev = "";
		
 
//		int len1 = str.length();//6
//		
//		for (int i=len1-1;i>=0;i--) { //53,2,1,0
//		
//		rev = rev+str.charAt(i);
//		 
//		}
//		
//		System.out.println("Original String is For Concatenation :"+str);
//		System.out.println("Reversed string is For Concatenation :"+rev);

		// 2. using character array

//		char a[] = str.toCharArray();
//		int len = a.length;
//		
//		for(int i=len-1;i>=0;i--) {
//			
//			rev = rev+a[i];
//		}
//		
//		System.out.println("Original String For Character Array is :"+str);
//		
//		System.out.println("Reversed String For Character Array is :"+rev);
//		
//		//3. using String buffer class
//		
//		StringBuffer sb = new StringBuffer(str);
//		
//		System.out.println("Using String Buffer Class :"+sb.reverse());

		// 4. Using String Builder

		StringBuilder sbl = new StringBuilder ();
		
		sbl.append(str );
		sbl.reverse();
		System.out.println("Using String Builder Class :"+rev);
		

		// Using String Buffer  when your running this class you can comment String rev = " " ;

//		StringBuffer sbl = new StringBuffer(str);
//
//		StringBuffer rev = sbl.reverse();
//		System.out.println("Using String Builder Class :" + rev);

	}
}
