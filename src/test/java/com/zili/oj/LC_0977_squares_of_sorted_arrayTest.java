package com.zili.oj;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class LC_0977_squares_of_sorted_arrayTest {

    @Test
    public void sortedSquares() {
        LC_0977_squares_of_sorted_array o = new LC_0977_squares_of_sorted_array();
        int[] A;
        int[] S;

        A = new int[]{-4, -1, 0, 3, 10};
        S = Arrays.copyOf(A, A.length);
        for (int i = 0; i < S.length; i++) S[i] = S[i] * S[i];
        Arrays.sort(S);
        assertArrayEquals(S, o.sortedSquares(A));

        A = new int[]{-4, 0, 1, 3, 10};
        S = Arrays.copyOf(A,A.length);
        for (int i = 0; i < S.length; i++) S[i] = S[i] * S[i];
        Arrays.sort(S);
        assertArrayEquals(S, o.sortedSquares(A));

        A = new int[]{-4, -3, -2};
        S = Arrays.copyOf(A,A.length);
        for (int i = 0; i < S.length; i++) S[i] = S[i] * S[i];
        Arrays.sort(S);
        assertArrayEquals(S, o.sortedSquares(A));

        A = new int[]{1,2,3};
        S = Arrays.copyOf(A,A.length);
        for (int i = 0; i < S.length; i++) S[i] = S[i] * S[i];
        Arrays.sort(S);
        assertArrayEquals(S, o.sortedSquares(A));

        A = new int[]{1};
        S = Arrays.copyOf(A,A.length);
        for (int i = 0; i < S.length; i++) S[i] = S[i] * S[i];
        Arrays.sort(S);
        assertArrayEquals(S, o.sortedSquares(A));

        A = new int[]{-3,-3,-2,1};
        S = Arrays.copyOf(A,A.length);
        for (int i = 0; i < S.length; i++) S[i] = S[i] * S[i];
        Arrays.sort(S);
        assertArrayEquals(S, o.sortedSquares(A));
    }
}