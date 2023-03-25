package com;

//Program to copy one array to another in java ?


public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destArray = new int[sourceArray.length];
        
        // Copying elements from sourceArray to destArray
        for (int i = 0; i < sourceArray.length; i++) {
            destArray[i] = sourceArray[i];
        }
        
        // Printing the elements of destArray
        System.out.println("Elements of destArray:");
        for (int i = 0; i < destArray.length; i++) {
            System.out.print(destArray[i] + " ");
        }
    }
}



