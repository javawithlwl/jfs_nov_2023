package cj.day2;

import java.util.Scanner;

public class RequiredCabs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int studentCount = sc.nextInt();
        System.out.println("Enter the number of seats in cab :");
        int capacity = sc.nextInt();

        int requiredCabs = studentCount / capacity;

        if(studentCount % capacity != 0) {
        	requiredCabs += 1;
        }
        System.out.println("Required cabs :"+requiredCabs);

    }
}
