package com.FileReader.CountOccurenceOfWord;
import java.io.*;
import java.util.Scanner;

public class CountOccurrenceOfWord {

    //using method to count occurrence of word
    static int countOccurenceOfWord(String str) {
        int count = 0;

        //writing inside try block. So, we can catch the exception in future
        try (FileReader read = new FileReader("C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week_03\\Day_04\\com\\FileReader\\CountOccurenceOfWord\\text.txt");
            BufferedReader reader = new BufferedReader(read)){

            String line;
            while((line = reader.readLine()) != null)
            {
                String words[] = line.split("\\s+");
                for (String word : words) {
                    // Case-insensitive match
                    if (word.equalsIgnoreCase(str)) {
                        count++;
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    //returning count
        return count;
    }
    //main method
    public static void main(String[] args) {

        //Taking input using scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word you want to search - ");
        String str = sc.nextLine();

        //displaying result
        System.out.println("The number of times the target word comes - " + countOccurenceOfWord(str));

        sc.close();
    }
}
