package com.FileReader.ReadAFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_a_File {
    public static void main(String[] args) {

        //filepath
        String filepath = "C:/Users/ss587/Downloads/Capgemini_files2/Week_03/Day_04/com/FileReader/ReadAFile/Test.txt";
        //writing inside try block. So, we can catch the exception in future
        try(FileReader read = new FileReader(filepath)) {
            BufferedReader reader = new BufferedReader(read);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error occurred in current file" + e.getMessage());
        }
    }
}
