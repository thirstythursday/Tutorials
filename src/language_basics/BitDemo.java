/*
 * These operators do exist in Java. Operate on integral types.
 * To print in binary the toBinaryString() method of the Integer
 * class is useful
 */
package language_basics;

/**
 *
 * @author george
 */
public class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println(val & bitmask);
        
        // my section
        int bits = 0b10111111;
        int newBits;
        newBits = bits >> 2;
        System.out.format("Formatted as hex: %X%n", newBits);
        System.out.format("Formatted as decimal: %d%n", newBits);
        System.out.format("Formatted as binary: " + Integer.toBinaryString(newBits) + "%n%n");
        
        int original = 0b10011001;
        int mask = 0b11111111;
        System.out.println("Original:    " + Integer.toBinaryString(original));
        System.out.println("Mask:        " + Integer.toBinaryString(mask));
        int bitwiseXOR = original ^  mask;
        System.out.println("Bitwise XOR:  " + Integer.toBinaryString(bitwiseXOR));
        
    }
    
}
