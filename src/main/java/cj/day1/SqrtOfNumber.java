package cj.day1;

import java.util.Scanner;

public class SqrtOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        double res = Math.sqrt(num);
        System.out.println("Sqrt of "+num+" is "+res);
    }
}
