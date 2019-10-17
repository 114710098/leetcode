package com.zili.oj;

import java.util.Arrays;

public class BASIC_0003_insert_sort {
    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void insertSort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            while (i > 0) {
                if (a[i] >= a[i - 1]) {
                    break;
                }
                swap(a, i, i-1);
                i = i - 1;
                System.out.println(Arrays.toString(a));
            }
        }
        return;
    }
}
