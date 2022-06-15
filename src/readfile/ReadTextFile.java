package readfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ReadTextFile {

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

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream out = new PrintStream(new FileOutputStream("file-data.txt"));
        System.setOut(out);
    }
}

