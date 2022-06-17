package readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

class ReadTextFile {

    public static void main(String[] args) throws Exception {

        // File path is passed as parameter
        File file = new File("C:src/readfile/file-data");

        BufferedReader br
                = new BufferedReader(new FileReader(file));


        String st;

        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }
}
        /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */
