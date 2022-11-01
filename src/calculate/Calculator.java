package calculate;

import java.util.Scanner;

public class Calculator {
    public void addition(int a, int b) {

        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }

    public void subtraction(int a, int b) {

        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
    }

    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is " + (a / b));
    }

    public void multiplication(int a, int b) {

        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
    }

    public void calculateResult(int a, int b, char op) {


        if (op == '+') {
            addition(a, b);
        } else if (op == '*') {
            multiplication(a, b);
        } else if (op == '/') {
            division(a, b);
        } else if (op == '-') {
            subtraction(a, b);
        } else {
            System.out.println("Invalid Input");
        }
    }
}