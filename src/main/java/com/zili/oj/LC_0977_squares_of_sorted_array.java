package com.zili.oj;

import java.util.Arrays;

public class LC_0977_squares_of_sorted_array {
    public int[] sortedSquares(int[] A) {
//        System.out.println(Arrays.toString(A));
        int N = A.length;
        int[] ans = new int[N];
        int hi=N-1;
        int lo=0;
        for (int i = N - 1; i >= 0; i--) {
//            System.out.printf("comparing A[%d]=%d, a[%d]=%d\n", lo, A[lo], hi, A[hi]);
            if (Math.abs(A[hi]) > Math.abs(A[lo])) {
                ans[i] = A[hi]*A[hi];
                hi -= 1;
            } else {
                ans[i] = A[lo]*A[lo];
                lo += 1;
            }
//            System.out.printf("lo=%d, hi=%d%n",lo,hi);
//            System.out.println(Arrays.toString(ans));
        }
        return ans;
    }

    public int[] sortedSquares_deprecated(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = A[i] * A[i];
        }
        for (int i = 0; i < N; i++) {
            if(A[i]>=0)
                break;
            bubble(ans);
        }
//        System.out.println(Arrays.toString(ans));
        return ans;
    }

    private void bubble(int[] a) {
//        System.out.printf("insert a[%d]=%s into %s\n", 0, a[0], Arrays.toString(a));
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] >= a[i + 1]) {
//                System.out.printf("swap: a[%d]=%d,a[%d]=%d\n",i,a[i],i+1,a[i+1]);
                swap(a, i, i + 1);
            } else {
//                System.out.println("insert done");
                break;
            }
        }
//        System.out.printf("after inserting: %s\n", Arrays.toString(a));
    }

    private void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
}
