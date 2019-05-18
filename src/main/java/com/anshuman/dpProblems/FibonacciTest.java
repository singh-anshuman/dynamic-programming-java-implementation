package com.anshuman.dpProblems;

public class FibonacciTest {
    public static void main(String[] args) {

        FibonacciNaiveRecursion fibonacciNaiveRecursion = new FibonacciNaiveRecursion();
        System.out.println("Fibonacci Number for 5 is: "+fibonacciNaiveRecursion.fibonacci(5));

        FibonacciMemoization fibonacciMemoization = new FibonacciMemoization();
        System.out.println("Memoization: Fibonacci Number for 100 is: "+fibonacciMemoization.fibonacci(100));

        FibonacciBottomUp fibonacciBottomUp = new FibonacciBottomUp();
        System.out.println("Bottom Up: Fibonacci Number for 100 is: "+fibonacciBottomUp.fibonacci(100));

        FibonacciBottomUpEnhanced fibonacciBottomUpEnhanced = new FibonacciBottomUpEnhanced();
        System.out.println("Bottom Up Enhanced: Fibonacci Number for 100 is: "+fibonacciBottomUpEnhanced.fibonacci(100));




    }
}
