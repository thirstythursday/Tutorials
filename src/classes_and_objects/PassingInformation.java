/*
 * Some parameter passing
 */
package classes_and_objects;

/**
 *
 * @author george
 */
public class PassingInformation {
    public static void main(String[] args) {
        double payment = computePayment(10000, 6.3, 14000, 48);
        System.out.println(payment);
    }

    private static double computePayment(double loanAmt,
            double rate,
            double futureValue,
            int numPeriods) {
        
        double interest = rate / 100.0;
        double partiall = Math.pow((1 + interest), numPeriods);
        double denominator = (1 - partiall) / interest;
        double answer = (-loanAmt / denominator) - ((futureValue * partiall) / denominator);
        return answer;

    }

    
}
