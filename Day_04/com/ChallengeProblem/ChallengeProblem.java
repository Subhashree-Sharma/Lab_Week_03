package com.ChallengeProblem;
import java.io.*;
import java.util.StringTokenizer;

public class ChallengeProblem {

    //main class
    public static void main(String[] args) {

        compareStringBuilderAndBuffer();
        compareFileReaderAndInputStreamReader("C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week_03\\Day_04\\com\\ChallengeProblem\\text.txt");
    }

    //using method to compare stringBuilder and buffer
        public static void compareStringBuilderAndBuffer() {
            String word = "Hello";
            int iterations = 1000000;

            //using StringBuilder
            long startTime = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                sb.append(word);
            }
            long endTime = System.nanoTime();
            //converting it in milliseconds
            System.out.println("Time taken by StringBuilder - " + (endTime - startTime) / iterations + " ms");

            //using StringBuffer
            startTime = System.nanoTime();
            StringBuffer sb2 = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                sb2.append(word);
            }
            endTime = System.nanoTime();
            System.out.println("Time taken by StringBuffer - " + (endTime - startTime) / iterations + "ms");
        }

        //using method to compare FileReader and stream Reader
    public static void compareFileReaderAndInputStreamReader(String filePath){
        try{
            //fileReader
            long startTime = System.nanoTime();
            FileReader read = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(read);
            long wordCount1 = countWords(reader);
            long endTime = System.nanoTime();

            System.out.println("FileReader word count: " + wordCount1);
            System.out.println("Time taken by File reader - " + (endTime - startTime)/1000000 + " in ms");

            //InputStreamReader
            startTime = System.nanoTime();
            InputStreamReader input = new InputStreamReader(new FileInputStream(filePath));
            BufferedReader reader1 = new BufferedReader(input);
            long wordCount2 = countWords(reader1);
            endTime = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordCount2);
            System.out.println("Time taken by InputStreamReader - " + (endTime - startTime)/1000000 + " in ms");
        }
        catch (IOException e){
            System.out.println("Error reading file - " + e.getMessage());
        }
    }

    //using method to count words
    private static long countWords(BufferedReader br) throws IOException {
        long wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordCount += tokenizer.countTokens();
        }
        br.close();
        return wordCount;
    }
}