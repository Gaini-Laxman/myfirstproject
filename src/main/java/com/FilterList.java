package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Program to filter elements from a list using streams?

public class FilterList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Original list: " + numbers);
		System.out.println("Even numbers: " + evenNumbers);
	}
}
 