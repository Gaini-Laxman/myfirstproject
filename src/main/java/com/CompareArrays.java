package com;

//Program to compare two arrays to check if they are equal or not.


import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}


