package cj.day3;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum =  (n * (n + 1)) / 2;
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
        double avg = sum / (double) n;
        System.out.println("Avg of first "+ n + " natural numbers is " + avg);
    }
}
