package com.zili.oj;

import javax.sound.midi.Soundbank;

public class LC_0204_count_primes {
    public int countPrimes(int n) {
        Double d = Math.sqrt(n);
        int N = d.intValue();
        boolean[] np = new boolean[n];
        for (int i = 0; i < N; i++) np[i] = false;
        for (int i = 2; i <= N; i++) {
            System.out.println("shieving "+i+"*N");
            if(np[i]) continue;
            for (int j = i*2; j < n; j += i) {
                np[j] = true;
                System.out.println("  "+j);
            }

        }
        if(n>0) np[0] = true;
        if(n>1) np[1] = true;
        if(n>2) np[2] = false;
        if(n>3) np[3] = false;

        int ans = 0;
        System.out.println("p:");
        for (int i = 0; i < n; i++)
            if (!np[i]) {
                ans += 1;
                System.out.println("  " + i);
            }
        return ans;
    }
}
