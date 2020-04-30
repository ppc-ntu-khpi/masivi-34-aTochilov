package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        byte n = 5;
        byte m = 14; //m <= 14
        System.out.println("The result is:\n"
                + Exercise.Calculate(n, m));
    }
}