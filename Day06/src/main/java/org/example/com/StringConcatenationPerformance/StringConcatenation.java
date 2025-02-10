package org.example.com.StringConcatenationPerformance;
public class StringConcatenation {

    //using method to concat with string
        public static void concatWithString(int n) {
            String str = "";
            for (int i = 0; i < n; i++) {
                //creates a new String object each time
                str += "a";
            }
        }
    }

