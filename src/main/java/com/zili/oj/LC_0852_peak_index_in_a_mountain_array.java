package com.zili.oj;

public class LC_0852_peak_index_in_a_mountain_array {
    public int peakIndexInMountainArray(int[] A) {
        int lo=1;
        int hi=A.length-2;
        int m=1;
        while (lo < hi) {
            m = (lo + hi) / 2;
            if(A[m]>A[m-1]&&A[m]>A[m+1])    //peak
                return m;
            if (A[m] > A[m - 1] && A[m] < A[m + 1]) {
                //up
                lo = m+1;
            } else {
                //down
                hi = m-1;
            }
        }
        return lo;
    }

}
