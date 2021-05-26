package org.sla;

public class ThyFibonacci implements Fibonacci {
    //Fields
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;

    // Constructor
    ThyFibonacci(int amount, int num1, int num2) {
        amountofNumbersInSequence = amount;
        number1 = num1;
        number2 = num2;
    }

    // Methods
    public void run() {
        System.out.println(number1);
        System.out.println(number2);
        int prev1;
        int prev2;
        int newNumber;
        prev1 = number1;
        prev2 = number2;
        for (int i = 2; i < amountofNumbersInSequence; i = i + 1) {
            newNumber = prev1 + prev2;
            System.out.println(newNumber);
            prev1 = prev2;
            prev2 = newNumber;
        }
    }
}
