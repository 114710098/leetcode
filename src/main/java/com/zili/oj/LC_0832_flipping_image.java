package com.zili.oj;

import java.util.Arrays;

public class LC_0832_flipping_image {
    public int[][] flipAndInvertImage(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] ans = new int[N][A[0].length];
        for (int i = 0; i < N; i++) {
//            System.out.println("before flip"+Arrays.toString(ans[i]));
            for (int j = 0; j < M; j++) {
                ans[i][N - j - 1] = A[i][j];
            }
            for (int j = 0; j < ans[i].length; j++) {
                int x = ans[i][j];
                if(x==0)
                    ans[i][j] = 1;
                if(x==1)
                    ans[i][j] = 0;
            }
//            System.out.println("after flip"+Arrays.toString(ans[i]));
        }
        return ans;
    }
}
