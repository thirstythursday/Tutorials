/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_and_objects;

/**
 *
 * @author george
 */
public class NumberHolder {
    
    public int anInt;
    public float aFloat;
    public byte aBinary;
    
    public static void main(String[] args) {
        NumberHolder nh = new NumberHolder();
        nh.anInt = 5;
        nh.aFloat = 4f;
        nh.aBinary = 0b1010001;
        System.out.println("nh.anInt = " + nh.anInt);
        System.out.println("nh.aFloat = " + nh.aFloat);
        System.out.println("nh.aBinary = " + nh.aBinary);
        System.out.format("nh.aBinary in base 8 = %o%n", nh.aBinary);
    }
    
}
