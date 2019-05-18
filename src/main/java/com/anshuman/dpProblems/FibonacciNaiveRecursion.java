package com.anshuman.dpProblems;

import java.time.Instant;

import static java.time.temporal.ChronoUnit.SECONDS;

//  This class contains a naive implementation of generating Fibonacci Numbers using recursion
public class FibonacciNaiveRecursion {

    public long fibonacci(long number) {
        Instant startTime = Instant.now();
        long f = _fibonacci(number);
        System.out.println("Total Time Taken: "+ startTime.until(Instant.now(), SECONDS) + " seconds");
        return f;
    }

    private long _fibonacci(long number) {
        if(number <= 1) {
            return number;
        }
        long f = _fibonacci(number-1) + _fibonacci(number-2);
        return f;
    }

}
