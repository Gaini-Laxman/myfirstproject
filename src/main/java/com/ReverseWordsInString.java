package com;

//Program to reverse the words in a given string.

public class ReverseWordsInString {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String reversedString = reverseWords(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }
    
    public static String reverseWords(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        return reversedString.toString().trim();
    }
}
 