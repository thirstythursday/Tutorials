/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_and_objects;

/**
 *
 * @author george
 */
public class LocalClassExample {
    
    static String regularExpression = "[^0-9]";
    
    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
        
        final int numberLength = 10;
        
        class PhoneNumber {
            
            String formattedPhoneNumber = null;
            
            PhoneNumber(String phoneNumber) {
                // replaces non-digits (dashes, etc) with spaces
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                // checks if 10 digits in length
                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }
        }
        
        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        
        if (myNumber1.getNumber() == null) System.out.println("First number is invalid");
        else System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null) System.out.println("Second number is invalid");
        else System.out.println("Second number is " + myNumber2.getNumber());
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
    
}
