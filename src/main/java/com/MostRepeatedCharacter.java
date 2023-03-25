package com;

// Program to find the most repeated character in a given string.

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {
    public static void main(String[] args) {
        String inputString = "hello world";
        char mostRepeatedChar = findMostRepeatedChar(inputString);
        System.out.println("Most repeated character in \"" + inputString + "\" is '" + mostRepeatedChar + "'");
    }
    
    public static char findMostRepeatedChar(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Counting the occurrence of each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }
        
        // Finding the most repeated character
        char mostRepeatedChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostRepeatedChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostRepeatedChar;
    }
}
