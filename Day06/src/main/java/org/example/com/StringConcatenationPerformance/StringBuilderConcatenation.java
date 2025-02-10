package org.example.com.StringConcatenationPerformance;
public class StringBuilderConcatenation {

    //using method to concat with string builder
    public static void concatStringBuilder(int n) {

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    //modify existing object
                    sb.append("a");
                }
    }
}
