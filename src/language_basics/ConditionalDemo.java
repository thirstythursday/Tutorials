/*
 * Conditional AND and conditional OR, and the Ternary operator which
 * is real cool!
 */
package language_basics;

/**
 *
 * @author george
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2)) System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 2)) System.out.println("value1 is 1 OR value2 is 2");
        
        String value3 = "someCondition is TRUE";
        String value4 = "someCondition is FALSE";
        String result = "";
        
        boolean someCondition;
                
        someCondition = true;
        // ternary operator, an abbreviated if-then-else ?:
        result = someCondition ? value3 : value4;
        System.out.println(result);
        
        someCondition = false;
        result = someCondition ? value3 : value4;
        System.out.println(result);
        
    }
}
