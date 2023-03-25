package com;

//Program to convert a list to a map using streams

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Convert list to map using streams
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(str -> str, str -> str.length()));

        // Print the resulting map
        System.out.println(map);
    }
}
