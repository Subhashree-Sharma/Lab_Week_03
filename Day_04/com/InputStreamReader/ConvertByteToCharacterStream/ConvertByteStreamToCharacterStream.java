package com.InputStreamReader.ConvertByteToCharacterStream;
import java.io.*;

public class ConvertByteStreamToCharacterStream {
    public static void main(String[] args) {

        //filepath
        String filePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week_03\\Day_04\\com\\InputStreamReader\\ConvertByteToCharacterStream\\text.txt"; // Change this to your file path

        //writing inside try block. So, we can catch the exception in future
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             //converting bytes to characters
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             //bufferedReader will do efficient reading
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //print each line
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
