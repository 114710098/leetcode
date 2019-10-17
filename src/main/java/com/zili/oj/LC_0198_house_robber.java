package com.zili.oj;

import java.util.Arrays;

//dp[0][i]: 在[0,i]抢，不抢i的，最大值
//dp[1][i]: 在[0,i]抢，抢i的，最大值
//转移方程:
//  dp[o][i+1]=max(dp[0][i],dp[1][i])
//  dp[1][i+1]=dp[0][n]+a[i+1]
//初始值:
//  dp[0][0]=0
//  dp[1][0]=a[0]
public class LC_0198_house_robber {
    public int rob(int[] nums) {
        int N = nums.length;
        if(N==0) return 0;
        if(N==1) return nums[0];
        int[][] dp = new int[2][N];
        dp[0][0]=0;
        dp[1][0]=nums[0];
        dp[1][1]=nums[1];
        for (int i = 0; i < N - 1; i++) {
            dp[0][i + 1] = Math.max(dp[0][i], dp[1][i]);
            dp[1][i + 1] = dp[0][i] + nums[i+1];
        }
//        System.out.println(Arrays.toString(dp[0]));
//        System.out.println(Arrays.toString(dp[1]));
        return Math.max(dp[0][N - 1], dp[1][N - 1]);
    }
}
