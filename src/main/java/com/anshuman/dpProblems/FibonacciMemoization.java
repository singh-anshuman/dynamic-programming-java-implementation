package com.anshuman.dpProblems;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FibonacciMemoization {

    private Map<Long, Long> memo = new HashMap<Long, Long>();

    public long fibonacci(long number) {
        Instant startTime = Instant.now();
        long f = _fibonacci(number);
        System.out.println("Total Time Taken: "+ startTime.until(Instant.now(), SECONDS) + " seconds");
        return f;
    }

    private long _fibonacci(long number) {
        if (memo.get(number) != null) {
            return memo.get(number);
        }
        if (number <= 1) {
            memo.put(number, number);
            return number;
        }
        long f = _fibonacci(number - 1) + _fibonacci(number - 2);
        memo.put(number, f);
        return f;
    }
}



