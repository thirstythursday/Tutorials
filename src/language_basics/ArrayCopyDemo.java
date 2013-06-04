/*
 * some cool array copying with the System class which seems to 
 * not require an import, which is cool.
 */
package language_basics;

/**
 *
 * @author george
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        
        // A method System.arraycopy
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        System.out.println(new String(copyTo));
        System.out.format("%s%n%n", copyTo);
        
        // Another method System.copyOfRange
        char[] copyFrom2 = {'h', 'e', 'l', 'l', 'o', ' ', 't', 'h', 'e', 'r', 'e' };
        char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom2, 2, 9);
        
        System.out.println(new String(copyTo2));
        
    }
    
}
