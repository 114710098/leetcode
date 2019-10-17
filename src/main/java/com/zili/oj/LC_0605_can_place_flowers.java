package com.zili.oj;

public class LC_0605_can_place_flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int N = flowerbed.length;
        int ans=0;
        int cnt=0;
        for (int i = 0; i < N; i++) {
            if (flowerbed[i] == 0) {
                cnt++;
                if(i==0) cnt++;
            } else {
                ans += (cnt - 1) / 2;
                cnt = 0;
            }

            if (i == N - 1 && cnt>0) {
                cnt += 1;
                ans += (cnt - 1) / 2;
            }
        }
        return ans>=n;
    }
}
