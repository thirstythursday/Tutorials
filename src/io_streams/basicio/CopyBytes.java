/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.basicio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author george
 */
public class CopyBytes {
    
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try {
            in = new FileInputStream("Xanadu.txt");
            out = new FileOutputStream("ByteOutput.txt");
            
            int c; // bytes are ints
            
            while ((c = in.read()) != -1) { // avoid this low level IO
                out.write(c);
            }
        } finally { // always close streams! Finally block is good
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
