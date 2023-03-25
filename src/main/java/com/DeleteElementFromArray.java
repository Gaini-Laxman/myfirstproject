package com;

import java.util.Arrays;

//Program to delete an element from an array

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int deleteIndex = 2;

        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        int[] newArr = Arrays.copyOf(arr, arr.length - 1);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array after deleting element: " + Arrays.toString(newArr));
    }
}

