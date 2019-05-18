package com.anshuman.dpProblems;

import java.util.HashMap;
import java.util.Map;

//  This class contains implementation of Triple Step DP Problem (8.1, Pg 94)
public class TripleStep {
    private Map<Long, Long> memo = new HashMap<>();

    public long totalWaysOfClimbing(long n) {
        if(memo.get(n) !=null) {
            return memo.get(n);
        }

        if(n<=0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        if(n == 3) {
            return 4;
        }

        long t = totalWaysOfClimbing(n-1)+totalWaysOfClimbing(n-2)+totalWaysOfClimbing(n-3);
        memo.put(n,t);

        return t;
    }

    public static void main(String[] args) {
        TripleStep ts = new TripleStep();

        System.out.println("Total Number of Ways for 4 steps: "+ts.totalWaysOfClimbing(4));
        System.out.println("Total Number of Ways for 7 steps: "+ts.totalWaysOfClimbing(7));
    }
}
