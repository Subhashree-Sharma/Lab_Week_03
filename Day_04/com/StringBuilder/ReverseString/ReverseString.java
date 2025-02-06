package com.StringBuilder.ReverseString;
import java.util.Scanner;

public class ReverseString {

    //using method to reverse a string
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    //main class
    public static void main(String[] args) {
        //Taking input using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string -  ");
        String input = scanner.nextLine();
        System.out.println("Reversed string- " + reverseString(input));
        scanner.close();
    }
}