package com;

import java.util.Arrays;

//Program to merge two arrays into one

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] mergedArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index++] = arr2[i];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}