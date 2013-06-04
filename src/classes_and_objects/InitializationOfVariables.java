/*
 * Initializing fields. We can provide an initial value for fields when we have
 * one, but if we don't there are methods we can use if the assignment requires
 * logic.
 * 
 * For static/class variables we can use a private static method (preferred)
 * or a static code block. For ivars we can use a final method or a code block.
 * 
 */
package classes_and_objects;

import java.util.Random;

/**
 *
 * @author george
 */
public class InitializationOfVariables {
    
    private static Random r = new Random();
    
    // we don't have the values we need yet for these variables
    private static int classVar1;
    private static int classVar2 = initializeClassVariable();
    private int ivar1;
    private int ivar2 = initializeInstanceVariable();

    // initializing a variable using a static initializaton block
    static {
        int x = r.nextInt(5) + 1;
        System.out.println("Random number assigned to classVar1 is: " + x);
        classVar1 = x;
    }

    // initializing a static variable with a private static method 
    private static int initializeClassVariable() {
        int x = r.nextInt(5) + 1;
        System.out.println("Random number assigned to classVar2 is: " + x);
        return x;
    }

    // initialization block without the "static" keyword for ivar
    // called with constructor, will execute AFTER main()
    {
        int x = r.nextInt(5) + 1;
        System.out.println("Random number assigned to ivar1 is: " + x);
        ivar1 = x;
    }
    
    // initializing an ivar with a final method, note the signature
    // called AFTER main()
    protected final int initializeInstanceVariable() {
        int x = r.nextInt(5) + 1;
        System.out.println("Random number assigned to ivar2 is: " + x);
        return x;
    }
    
    // need a main() method for testing
    public static void main(String[] args) {
        System.out.format("%nSTART MAIN%n%n");
        
        // instantiate
        InitializationOfVariables iov = new InitializationOfVariables();
        
        System.out.println("classVar1 is: " + classVar1);
        System.out.println("classVar2 is: " + classVar2);
        System.out.println("ivar1 is: " + iov.ivar1);
        System.out.println("ivar2 is: " + iov.ivar2);
    }
    
}
