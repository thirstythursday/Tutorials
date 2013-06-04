/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.basicio;

/**
 *
 * @author george
 */
public class Root2 {
    
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);
        
        /*
         * %d formats an integer as a decimal value (the i)
         * %f formats a float as a decimal value (the r)
         * %n is a platform-correct line separator, \n might not
         * be correct on every platform! %n is the equivalent to the
         * new line aspect of "println" (vs just "print")
         */
        System.out.format("The square root of %d is %f.%n", i, r);
        
        // some other optional elements to format
        System.out.format("%f, %1$+020.10f %n", Math.PI);
        
        
    }
    
}
