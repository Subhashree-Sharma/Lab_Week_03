package com.StringBuffer.CompareStringBuffer;

public class CompareStringBuffer {
    public static void main(String[] args) {

        //creating this ref for iterating 1 million times
        int strings = 1000000;

        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < strings; i++) {
            sb.append("Hello");
        }

        long startTimeBuilder = System.nanoTime();
        for(int i = 0; i < strings; i++){
            sb2.append("hello");
        }

       // long startTimeBuffer = System.nanoTime();
        long endTimeBuffer = System.nanoTime();

        //converting duration millisecond
        long durationBuffer = (endTimeBuffer - startTimeBuffer)/strings;

       // long startTimeBuilder = System.nanoTime();
        long endTimeBuilder = System.nanoTime();

        long durationBuilder = (endTimeBuilder - startTimeBuilder)/strings;

        System.out.println("StringBuffer time duration - " + durationBuffer + " in ms");
        System.out.println("StringBuilder time duration - " + durationBuilder +" in ms");
    }
}
