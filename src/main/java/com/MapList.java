package com;

import java.util.*;
import java.util.stream.Collectors;

//Program to map elements of a list to a new list using streams

public class MapList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Map elements of the list to a new list using streams
        List<Integer> mappedList = list.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());

        // Print the mapped list
        System.out.println(mappedList);
    }
}
