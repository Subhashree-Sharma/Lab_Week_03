package com.StringBuffer.ConcatenateStrings;
import java.util.Scanner;

public class ConcatenateStrings {

    //using method to concatenate strings
    public static String concatenateStrings(String str[]){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }

    //main class
    public static void main(String[] args) {

        //Taking input using scanner
        Scanner sc = new Scanner(System.in);
        int n = 3;
        System.out.println("Enter 3 strings - ");
        String []str = new String[n];

        //taking user input
        for(int i = 0; i < str.length; i++){
            str[i] = sc.nextLine();
        }
        //displaying result
        System.out.println("Concatenated string - " + concatenateStrings(str));

    sc.close();
    }
}
