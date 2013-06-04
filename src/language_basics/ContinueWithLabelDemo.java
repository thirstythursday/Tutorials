/*
 * Can use labels with continue! What a great example to show other
 * uses for postfix. Instead of incrementing j and k in the loop,
 * and decrementing n, for that matter,
 * the postfix operator does the increment, after the conditional tests
 * in the if statement and while loop is evaluated!
 */
package language_basics;

/**
 *
 * @author george
 */
public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;
        
        int max = searchMe.length() - substring.length();
        
        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
        
    }
}
