/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

/**
 *
 * @author george
 */
public class Thoughts {
    private static Class<?> t2;
    private String[] stringArray = {"a", "hi"}; // let's see if string array is like an object

    public static void main(String[] args) {

        Thoughts t1 = new Thoughts(); // instantiate

        t2 = t1.stringArray.getClass(); // act on the instance

        System.out.println(t1.toString());
        System.out.println(t2);
    }
}
