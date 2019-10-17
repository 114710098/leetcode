package com.zili.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_0905_sort_array_by_parity {
    private void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    public int[] sortArrayByParity(int[] A) {
//        System.out.println(Arrays.toString(A));
        int N = A.length;
        int[] ans = Arrays.copyOf(A, N);
        int i=0;
        int j=N-1;
        while (i < j) {
            while(ans[i]%2==0&&i<j) i+=1;
            while(ans[j]%2!=0&&i<j) j-=1;
            if((i<j)&&(ans[i]%2!=0)&&(ans[j]%2==0)) {
                swap(ans, i, j);
                i += 1;
                j -= 1;
            }
//            System.out.printf("i=%d,j=%d\n",i,j);
        }
//        System.out.println(Arrays.toString(ans));
//        System.out.println();
        return ans;
    }
}
