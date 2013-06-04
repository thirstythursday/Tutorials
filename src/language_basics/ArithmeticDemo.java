/*
 * some real basic arithmetic
 */
package language_basics;

/**
 *
 * @author george
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        
        int result = 1 + 2;
        System.out.print(result);
        
        result = result - 1;
        System.out.print(", " + result);
        
        result = result * 2;
        System.out.print(", " + result);
     
        result = result / 2;
        System.out.print(", " + result);
        
        result = result + 8;
        System.out.print(", " + result);
        
        result = result % 7;
        System.out.println(", " + result);
        
        // with compound assignments
        
        result = 1 + 2;
        System.out.print(result);
        
        result -= 1;
        System.out.print(", " + result);
        
        result *= 2;
        System.out.print(", " + result);
     
        result /= 2;
        System.out.print(", " + result);
        
        result += 8;
        System.out.print(", " + result);
        
        result %= 7;
        System.out.println(", " + result);
    }
}
