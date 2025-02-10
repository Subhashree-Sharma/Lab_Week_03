package org.example.com.LargeFileReadingEfficiency;
public class LargeFileReadingEfficiency {

        public static void main(String[] args) {

            //Filepath for 1mb file
            String filePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week_03\\Day_06\\src\\main\\java\\org\\example\\com\\LargeFileReadingEfficiency\\1mb-examplefile-com.txt";

            //Filepath for 100mb file
            //String filePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week_03\\Day_06\\src\\main\\java\\org\\example\\com\\LargeFileReadingEfficiency\\100mb-examplefile-com.txt";
            System.out.println("Large File Reading Performance Test - ");

            //measure FileReader time
            long startTime = System.currentTimeMillis();
            FileReaderReading.readUsingFileReader(filePath);

            long endTime = System.currentTimeMillis();
            System.out.println("FileReader Time -  " + (endTime - startTime) + " ms");

            //measure InputStreamReader time
            startTime = System.currentTimeMillis();

            InputStreamReaderReading.readUsingInputStreamReader(filePath);
            endTime = System.currentTimeMillis();
            System.out.println("InputStreamReader Time - " + (endTime - startTime) + " ms");
        }
    }


