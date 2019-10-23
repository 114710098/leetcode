package com.zili.oj;

public class LC_0944_delete_columns_to_make_sorted {
    public int minDeletionSize(String[] A) {
        int ans=0;
        for (int col = 0; col < A[0].length(); col++) {
            for (int i = 0; i < A.length-1; i++) {
                if (A[i].charAt(col) > A[i + 1].charAt(col)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
