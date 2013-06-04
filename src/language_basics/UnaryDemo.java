/*
 * Unary means just one operand is required, can do only a few things
 */
package language_basics;

/**
 *
 * @author george
 */
public class UnaryDemo {
    public static void main(String[] args) {
        
        // indicate positive (not usually necessary)
        int result = +1;
        System.out.println(result);
        
        // unary operator can decrement by one
        result--;
        System.out.println(result);
        
        // or increment by one
        result++;
        System.out.println(result);
        
        // or negate
        result = - result;
        System.out.println(result);
        
        //or invert a boolean (the !)
        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }
}
