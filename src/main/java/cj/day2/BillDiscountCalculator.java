package cj.day2;

import java.util.Scanner;

public class BillDiscountCalculator {

    public static void main(String[] args) {

        // Accept bill amount from the user input if the bill amount is greater than 5000 then give 20% discount,
        // print the discount amount and net amount

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        float billAmount = sc.nextFloat();
        float discount = 0;

        if (billAmount > 5000) {
            discount = billAmount * 0.2f;
        }
        float netAmount = billAmount - discount;

        System.out.println("Bill Amount :" + billAmount);
        System.out.println("Discount    :" + discount);
        System.out.println("Net Amount  :" + netAmount);


    }
}
