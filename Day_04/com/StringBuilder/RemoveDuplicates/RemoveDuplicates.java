package com.StringBuilder.RemoveDuplicates;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    //using method to remove duplicates
    static String removeDuplicates(String str){

        StringBuilder sb = new StringBuilder();
        //hashset for keeping track of duplicates
        HashSet<Character> track = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!track.contains(ch)){
                sb.append(ch);
                track.add(ch);
            }
        }
        //returning sb
        return sb.toString();
    }
    //main class
    public static void main(String[] args) {

        //taking input using scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text -");
        String str = sc.nextLine();

        System.out.println("String after removing duplicates - " + removeDuplicates(str));
    }
}
