package readfile;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;

public class TestRead {

    public static void main(String args[])throws IOException{

        String content = new String();

        int count=1;

        File file = new File("C:\\Users\\Devraj\\IdeaProjects\\ReadTextFile\\src\\readfile\\file-data");
        LinkedList<String> list = new LinkedList<String>();

        try {
            Scanner sc;
            sc = new Scanner(new FileInputStream(file));
            while (sc.hasNextLine()){
                content = sc.nextLine();
                list.add(content);
            }
            sc.close();
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nProgram terminated Safely...");
        }

        Collections.reverse(list);
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.print("Node " + (count++) + " : ");
            System.out.println(i.next());
        }
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
