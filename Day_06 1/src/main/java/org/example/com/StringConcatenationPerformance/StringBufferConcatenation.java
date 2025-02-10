package org.example.com.StringConcatenationPerformance;
public class StringBufferConcatenation {

    //using method to concat with string buffer
        public static void concatStringBuffer(int n) {
            StringBuffer sb2 = new StringBuffer();
            for (int i = 0; i < n; i++) {
           //thread-safe, slightly slower than stringBuilder
                sb2.append("a");
            }
        }
    }


