package com.zili.oj;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BASIC0003_insert_sortTest {

    @Test
    public void insertSort() {
        int[] a;
        int[] b;

        a = new int[]{3, 1, 4, 1, 5, 9, 2, 6};
        b = new int[]{3, 1, 4, 1, 5, 9, 2, 6};
        BASIC_0003_insert_sort.insertSort(a);
        Arrays.sort(b);
        assertArrayEquals(b, a);

        a = new int[]{3, 11, 4, 1, 15, 9, 12, 6};
        b = new int[]{3, 11, 4, 1, 15, 9, 12, 6};
        BASIC_0003_insert_sort.insertSort(a);
        Arrays.sort(b);
        assertArrayEquals(b, a);
    }
}