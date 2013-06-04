package language_basics;

/**
 *
 * @author george
 */
public class QuestionsAndExercises {

    public static void main(String[] args) {
        
        // OPERATORS
       
        // 1
        // arrayOfInts[j] > arrayOfInts[j+1]
        // contains greater than and addition operators

        // 2
        int i = 10;
        int n = 0;
        n = i++ % 5; // 0
        System.out.println(n);
        i = 10;
        n = ++i % 5; // 1
        System.out.println(n);
        
        // 3
        // ! is used to invert the value of a boolean
        
        // 4
        // == is used to compare two values
        
        //5
        // result = someCondition ? value1 : velue2;
        
        int aNumber = 3;
        
        if (aNumber >= 0) if (aNumber == 0) System.out.println("first string");
        else System.out.println("second string");
        System.out.println("third string");

        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }
        System.out.println("third string");
    }
}
