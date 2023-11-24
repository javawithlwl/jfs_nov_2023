package cj.day1;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        float p = 100000;
        float r = 16;
        float t = 2;
        float si = (p * r * t) / 100;
        System.out.println("Simple interest on amount " + p + " for " + t + " years at " + r + " % is " + si);
    }
}
