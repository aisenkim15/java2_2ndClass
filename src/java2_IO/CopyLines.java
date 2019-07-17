package java2_IO;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

       try {
           inputStream = new BufferedReader(new FileReader("executeFile.txt"));
           outputStream = new PrintWriter(new FileWriter("newFile.txt"));

           String l;
           int counter = 0;
           while ((l = inputStream.readLine()) != null) {
               outputStream.println(l);
           }
       } finally {
           if (inputStream != null) {
               inputStream.close();
           }
           if (outputStream != null) {
               outputStream.close();
           }
       }
    }
}
