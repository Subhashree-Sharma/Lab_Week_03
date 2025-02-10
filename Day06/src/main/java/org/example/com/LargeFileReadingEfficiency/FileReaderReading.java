package org.example.com.LargeFileReadingEfficiency;
import java.io.*;
public class FileReaderReading {

    //using fileReader method to read file
    public static void readUsingFileReader(String filePath) {
            try (FileReader fileReader = new FileReader(filePath)) {
                int ch;
                while ((ch = fileReader.read()) != -1) {
                    // Reading character by character - Slow
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

