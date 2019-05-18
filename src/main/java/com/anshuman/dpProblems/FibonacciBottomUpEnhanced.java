package com.anshuman.dpProblems;

import java.time.Instant;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FibonacciBottomUpEnhanced {

    public long fibonacci(long number) {
        Instant startTime = Instant.now();
        long f = _fibonacci(number);
        System.out.println("Total Time Taken: "+ startTime.until(Instant.now(), SECONDS) + " seconds");
        return f;
    }

    private long _fibonacci(long number) {
        if(number<=1) {
            return number;
        }
        long[] f = new long[3];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for(long i=3; i<=number; i++) {
            long temp = f[2];
            f[2] = f[2]+f[1];
            f[0]=f[1];
            f[1]=temp;
        }
        return f[2];
    }

}
