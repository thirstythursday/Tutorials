/*
 * Using the continue in a counterintuitive way to count P's
 */
package language_basics;

/**
 *
 * @author george
 */
public class ContinueDemo {
    public static void main(String[] args) {
        
        String searchMe = "peter piper picked a " + " peck of picked peppers";
        int max = searchMe.length();
        int numPs = 0;
        
        for (int i = 0; i < max; i++) {
            // continue loop if NOT A P
            if (searchMe.charAt(i) != 'p') continue;
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
