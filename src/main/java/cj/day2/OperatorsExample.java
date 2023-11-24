package cj.day2;

public class OperatorsExample {

    // Arithmetic operators  : + - * / %

    // Relational operators : > < >= <= == !=

    // Logical operators : && || !

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("Sub of " + a + " and " + b + " is " + (a - b));
        System.out.println("Mul of " + a + " and " + b + " is " + (a * b));
        System.out.println("Div of " + a + " and " + b + " is " + (a / b));
        System.out.println("Rem of " + a + " and " + b + " is " + (a % b));

        System.out.println("Is " + a + " is greater than " + b + " : " + (a > b));
        System.out.println("Is " + a + " is less than " + b + " : " + (a < b));
        System.out.println("Is " + a + " is greater than or equal to " + b + " : " + (a >= b));
        System.out.println("Is " + a + " is less than or equal to " + b + " : " + (a <= b));
        System.out.println("Is " + a + " is equal to " + b + " : " + (a == b));
        System.out.println("Is " + a + " is not equal to " + b + " : " + (a != b));

    }
}
