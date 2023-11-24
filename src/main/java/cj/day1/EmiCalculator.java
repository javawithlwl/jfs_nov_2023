package cj.day1;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loan amount :");
        double amount = sc.nextDouble();
        System.out.println("Enter the rate of interest (%):");
        double rate = sc.nextDouble();
        System.out.println("Enter the duration (months):");
        int duration = sc.nextInt();

        // Calculate the monthly interest rate

        double r = rate / 12 / 100;
        double emi = amount * r * Math.pow(1 + r, duration) / (Math.pow(1 + r, duration) - 1);
        double totalInterest = emi * duration - amount;
        double totalAmount = emi * duration;

        System.out.println("Loan amount         :"+amount);
        System.out.println("Rate of interest (%):"+rate);
        System.out.println("Duration            :"+duration);
        System.out.println("EMI                 :"+Math.round(emi));
        System.out.println("Total interest      :"+Math.round(totalInterest));
        System.out.println("Total amount        :"+Math.round(totalAmount));

    }
}
