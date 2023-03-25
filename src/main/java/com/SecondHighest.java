package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

//Finding Second Highest for given array using Stream Method 

public class SecondHighest {

	public static void main(String[] args) {
		
		
		int [] numbers = {5, 2, 8, 10, 1};

		/*
		 * OptionalInt secondHighest = Arrays.stream(numbers) .boxed()
		 * .sorted(Comparator.reverseOrder()) .skip(1) .mapToInt(Integer::intValue)
		 * .findFirst();
		 * 
		 * if(secondHighest.isPresent()){
		 * System.out.println("second highest number is :" +secondHighest.getAsInt()); }
		 * else{ System.out.println("Array is empty or has one element"); }
		 */
		
		//Using For Loop 
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i = 0; i<numbers.length;i++) {
			
			if(numbers[i] > highest) {
				
				secondHighest = highest;
				
				highest=numbers[i];
			}
			
			else if (numbers[i] > secondHighest && numbers[i] != highest) {
				
			
			secondHighest = numbers[i];
		}
	
		}
		
	if(secondHighest==Integer.MIN_VALUE) {
		
		System.out.println("There is no second highest number");
	}
	else {
		System.out.println("second highest number is :" + secondHighest);	

	}

	}
}
