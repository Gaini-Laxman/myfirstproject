package com;


//Program to search for an element in an array.

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int searchElement = 3;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in the array!");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
