/*
 * While loop stuff
 */
package language_basics;

/**
 *
 * @author george
 */
public class WhileDemo {
    public static void main(String[] args) {

        // count to 10 using while
        int count = 1;
        System.out.println("\nCount is: ");
        
        while(count < 11) {
            System.out.print(count + " ");
            count++;
        }
        
        // using do-while
        count = 1;
        System.out.println("\nCount is: ");
        
        do {
            System.out.print(count + " ");
            count++;
        } while (count < 11);
        
        
        // finish off with an infinite loop
        while (true) {
            // never break or change while evaluation
        }
    }
}
