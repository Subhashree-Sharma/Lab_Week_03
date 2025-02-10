package org.example.com.LargeFileReadingEfficiency;
import java.io.*;
public class InputStreamReaderReading {
    //Reading file using inputStream reader
        public static void readUsingInputStreamReader(String filePath) {
            try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
                //read in chunks - faster
                char[] buffer = new char[8192];
                while (inputStreamReader.read(buffer) != -1) {
                    //reading in chunks Efficient
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

