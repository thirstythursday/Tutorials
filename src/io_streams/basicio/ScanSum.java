/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.basicio;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author george
 */
public class ScanSum {
    
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        double sum = 0;
        
        try {
            s = new Scanner(new BufferedReader(new FileReader("USNumbers.txt")));
            s.useLocale(Locale.US);
            while(s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s.next();
                }
            }
        } finally {
            s.close();
        }
        
        System.out.println(sum);
    }
    
}
