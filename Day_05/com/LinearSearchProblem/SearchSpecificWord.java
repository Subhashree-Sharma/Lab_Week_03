package com.LinearSearchProblem;
import java.util.Scanner;

public class SearchSpecificWord {

    //using method to search specific element
    public static String SearchForSpecific(String[] str, String targetWord){
            for(int i = 0; i < str.length; i++){
                if(str[i].contains(targetWord)){
                    return targetWord;
                }
            }
            return "Not Found";
    }

    public static void main(String[] args) {

        //using scanner for taking input
        Scanner sc = new Scanner(System.in);
        int n = 3;
        String[] str = new String[n];

        //taking 3 strings as input
        System.out.println("Enter 3 sentences");
        for(int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }
        System.out.println("Enter the target word - ");
        String targetWord = sc.nextLine();
        String result = SearchForSpecific(str, targetWord);

        //displaying result
        System.out.println("The target word in the string is : " + result);
    }
}
