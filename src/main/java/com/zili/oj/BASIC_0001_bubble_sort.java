package com.zili.oj;

import java.util.Arrays;

public class BASIC_0001_bubble_sort {
    public static void bubbleSort(int[] a) {
        int N = a.length;
        int tmp;
        for (int i = N-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{8, 1, 3, 2, 5};
        int[] a2 = new int[]{8, 1};
        int[] a = a1;

        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
