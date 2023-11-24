package cj.day2;

import java.util.Scanner;

public class ProfitCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the buying price :");
        float bp = sc.nextFloat();
        System.out.println("Enter the selling price :");
        float sp = sc.nextFloat();
        if(sp > bp) {
            float profit = sp - bp;
            System.out.println("Profit is :" + profit);
        }else if(bp > sp) {
            float loss = bp - sp;
            System.out.println("Loss is :" + loss);
        }else {
            System.out.println("No profit no loss");
        }
        System.out.println("Thanks for using our app");
    }
}
