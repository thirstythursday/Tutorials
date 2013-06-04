/*
 * Enhanced for loop good for iterating over collections and arrays.
 */
package language_basics;

/**
 *
 * @author george
 */
public class EnhancedForDemo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
    
}
