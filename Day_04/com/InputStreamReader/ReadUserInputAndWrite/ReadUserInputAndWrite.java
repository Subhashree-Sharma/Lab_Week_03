package com.InputStreamReader.ReadUserInputAndWrite;
import java.io.*;
public class ReadUserInputAndWrite {

    public static void main(String[] args) {

        //creating InputStreamReader and BufferedReader to read user input from the console
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //creating FileWriter to write input to a file
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;

        try {
            //open the file for writing
            fileWriter = new FileWriter("C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week_03\\Day_04\\com\\InputStreamReader\\ReadUserInputAndWrite\\text.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            String userInput;

            System.out.println("Enter text or type 'exit' to stop - ");

            //keep reading user input until 'exit' is entered
            while (true) {
                userInput = bufferedReader.readLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    //exit the loop if user types 'exit'
                    break;
                }

                //write input to the file, followed by a new line
                bufferedWriter.write(userInput);
                bufferedWriter.newLine();
            }

            System.out.println("Input saved to file successfully.");
        } catch (IOException e) {
            System.err.println("Error while reading input or writing to file: " + e.getMessage());
        } finally {
            try {
                //close the resources after use
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("Error while closing resources: " + e.getMessage());
            }
        }
    }
}
