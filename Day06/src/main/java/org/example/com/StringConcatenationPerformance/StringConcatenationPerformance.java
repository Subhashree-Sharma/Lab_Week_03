package org.example.com.StringConcatenationPerformance;
public class StringConcatenationPerformance {
        public static void main(String[] args) {

            //no. of concatenations
            int n = 1000000;

            System.out.println("Concatenation Performance Test for " + n + " operations - ");

            //measure time taken by String
            long startTime = System.currentTimeMillis();

            StringConcatenation.concatWithString(n);
            long endTime = System.currentTimeMillis();
            System.out.println("String Time - " + (endTime - startTime) + " ms");

            //measure time taken by StringBuilder
            startTime = System.currentTimeMillis();
            StringBuilderConcatenation.concatStringBuilder(n);

            endTime = System.currentTimeMillis();
            System.out.println("StringBuilder Time - " + (endTime - startTime) + " ms");

            //measure time taken by StringBuffer
            startTime = System.currentTimeMillis();
            StringBufferConcatenation.concatStringBuffer(n);

            endTime = System.currentTimeMillis();
            System.out.println("StringBuffer Time - " + (endTime - startTime) + " ms");
        }
    }


