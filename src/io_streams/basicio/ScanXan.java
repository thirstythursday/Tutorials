/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.basicio;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author george
 */
public class ScanXan {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = null;
        
        try {
            // Scanner is TOKEN delimited
            s = new Scanner(new BufferedReader(new FileReader("Xanadu.txt")));
            // s.useDelimiter(",\\s*"); changes delimiter to comma and whitespace
            while(s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
    
}
