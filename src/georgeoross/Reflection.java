/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

import java.lang.reflect.Method;

/**
 *
 * @author george
 */
public class Reflection {

    public static void main(String[] args) {
        Method[] methodArray = Object.class.getDeclaredMethods();
        for (int i = 0; i < methodArray.length; i++) {
            
            System.out.format("Method (toString) %s%n", methodArray[i]);
        }
    }
}
