/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.basicio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author george
 */
public class CopyCharacters {
    
    public static void main(String[] args) throws IOException {
        
        FileReader inputStream = null;
        FileWriter outputStream = null;
        
        try {
            inputStream = new FileReader("Xanadu.txt");
            outputStream = new FileWriter("CharacterOutput.txt");
            
            int c; // uses an int, like FileInputStream
            
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
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
