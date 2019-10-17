package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class BASIC0001_bubble_sortTest {

    @Test
    public void bubbleSort() {
        int[] a1 = new int[]{3, 1, 4, 1, 5, 9, 2, 6};
        int[] a2 = new int[]{1, 2, 4};
        int[] a3 = new int[]{4, 3, 1, 2, 1, 2};
        int[] a4 = new int[]{3, 1, 4, 1, 5, 9, 2, 6};

        int[] expect = new int[]{1, 1, 2, 3, 4, 5, 6, 9};
        BASIC_0001_bubble_sort.bubbleSort(a1);
        BASIC_0001_bubble_sort.bubbleSort(a2);
        BASIC_0001_bubble_sort.bubbleSort(a3);
        assertArrayEquals(
                new int[]{1, 1, 2, 3, 4, 5, 6, 9},
                a1
        );
        assertArrayEquals(
                new int[]{1, 2, 4},
                a2
        );
        assertArrayEquals(
                new int[]{1, 1, 2, 2, 3, 4},
                a3
        );
    }
}