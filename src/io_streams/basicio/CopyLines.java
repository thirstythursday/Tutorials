/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.basicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author george
 */
public class CopyLines {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        
        try {
            inputStream = new BufferedReader(new FileReader("Xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("LineOutput.txt"));
            String line;
            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
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
