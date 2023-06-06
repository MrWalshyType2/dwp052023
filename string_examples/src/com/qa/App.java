package com.qa;

import java.util.Locale;

public class App {

    public static void main(String[] args) {
        String name = "Bob";
        String greeting = "Hello there " + name;

        // simple methods
        System.out.println("greeting toUppercase: " + greeting.toUpperCase(Locale.UK));
        System.out.println("greeting toLowercase: " + greeting.toLowerCase());
        System.out.println("greeting length     : " + greeting.length());
        System.out.println("greeting repeat(3)  : " + greeting.repeat(3));
        System.out.println();

        // comparison
        System.out.println("greeting contains(name)        : " + greeting.contains(name));
        System.out.println("greeting startsWith(\"Hello\")   : " + greeting.startsWith("Hello"));
        System.out.println("greeting endsWith(name)        : " + greeting.endsWith(name));
        System.out.println();

        // iterating over a strings characters
        System.out.print("NAME: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        // simple regular expressions
        String testString = "Hi there, 123, play the saxophone";
        System.out.println("testString matches(Hi.*): " + testString.matches("Hi.*"));
        System.out.println("testString matches(123) : " + testString.matches("123"));
        System.out.println();

        // splitting string based on regular expression
        System.out.println("testString split(\" \"): ");
        String[] splitString = testString.split(" "); // split on whitespace character
        for (String str : splitString) System.out.println(str);


        // Pattern: Numbers 1-9 followed by two letters followed by 5 numbers
        String pattern = "[1-9][a-zA-Z]{2}[1-9]{5}";
        String niPattern = "[A-Z]{2}[1-9]{6}[ABCD]";
        String id = "5MW43236";
        System.out.println(id.matches(pattern));
    }
}
