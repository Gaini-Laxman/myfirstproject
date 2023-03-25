package com;

public class AverageOfArray {
	
	    public static void main(String[] args) {
	        int[] arr = {5, 10, 15, 20, 25,30,35};
	        double avg = getAverage(arr);
	        System.out.println("Average: " + avg);
	    }

	    public static double getAverage(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        double avg = (double) sum / arr.length;
	        return avg;
	    }
	}



