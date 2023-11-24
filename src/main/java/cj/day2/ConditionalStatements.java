package cj.day2;

import java.util.Scanner;

public class ConditionalStatements {

    // if, if-else, if-else-if, nested if, switch-case


    public static void main(String[] args) {
        // Simple if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if (age < 0) {
            age = -age;
        }
        System.out.println("Entered age is :" + age);


    }
}
