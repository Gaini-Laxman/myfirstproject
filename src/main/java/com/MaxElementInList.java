package com;

//Program to find the maximum element in a list using streams

import java.util.*;

public class MaxElementInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 6);

        // Find the maximum element in the list using streams
        int max = list.stream().max(Integer::compare).orElse(0);

        // Print the maximum element
        System.out.println("Maximum element in the list: " + max);
    }
}

 