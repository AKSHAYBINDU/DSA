package Projects;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Mortage
 */
public class Mortage {

    public static void main(String[] args) {

        System.out.print("Principle: ");
        Scanner scanner = new Scanner(System.in);
        int principle = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualIR = scanner.nextDouble();
        System.out.print("Period (Year): ");
        int period = scanner.nextInt();
        int noOfPayments = period * 12;
        double monthlyIR = annualIR / 12 / 100;
        double mortage = principle
                * (monthlyIR * Math.pow(1 + monthlyIR, noOfPayments)) / (Math.pow(1 + monthlyIR, noOfPayments) - 1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: " + mortageFormatted);
    }
}