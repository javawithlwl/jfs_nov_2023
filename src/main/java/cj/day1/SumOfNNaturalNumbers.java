package cj.day1;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value :");
        int N = sc.nextInt();
        int sum = N * (N + 1) / 2;
        System.out.println("Sum of first " + N + " natural numbers is " + sum);
    }
}
