/*
 * Comparison operators, equal to, greater than, less than.
 */
package language_basics;

/**
 *
 * @author george
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2) System.out.println("value1 == value2");
        if(value1 != value2) System.out.println("value2 != value2");
        if(value1 > value2) System.out.println("value1 < value2");
        if(value1 < value2) System.out.println("value1 < value2");
        if(value1 <= value2) System.out.println("value1 <= value2");
        
    }
}
