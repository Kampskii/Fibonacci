package org.sla;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fibonnacci Sequence 1:");
        Fibonacci fib1 = new ThyFibonacci(8, 4, 9);
        fib1.run();

        System.out.println("Fibonacci Sequence 2:");
        Fibonacci fib2 = new ThyFibonacci(6,3,7);
        fib2.run();
    }
}
