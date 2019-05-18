package com.anshuman.dpProblems;

import java.time.Instant;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FibonacciBottomUp {

    public long fibonacci(int number) {
        Instant startTime = Instant.now();
        long f = _fibonacci(number);
        System.out.println("Total Time Taken: "+ startTime.until(Instant.now(), SECONDS) + " seconds");
        return f;
    }

    private long _fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        long []f = new long[number+1];
        f[0]=0;
        f[1]=1;

        for(int i=2;i<=number;i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[number];
    }
}
