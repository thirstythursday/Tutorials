/*
 * Java 7 introduces Strings in switch statements, I like the use of the
 * toLowerCase() method so input is case-insensitive.
 * 
 * The String in the switch expression is compared with each case label
 * as if the String.equals method were being used.
 */
package language_basics;

/**
 *
 * @author george
 */
public class SwitchDemoWithStrings {
    
    public static void main(String[] args) {
        
        String month = "August";
        
        // Why does the example fully qualify the method?
        int returnedMonthNumber = SwitchDemoWithStrings.getMonthNumber(month);
        
        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }

    private static int getMonthNumber(String month) {
        
        int monthNumber = 0;
        
        if (month == null) return monthNumber;
        
        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }
        
        return monthNumber;

    }
    
}
