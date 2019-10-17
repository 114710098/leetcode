package com.zili.oj;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class LC_0832_flipping_imageTest {

    @Test
    public void flipAndInvertImage() {
        LC_0832_flipping_image o = new LC_0832_flipping_image();

        int[][] input = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(input));
        int[][] ans = o.flipAndInvertImage(input);
        System.out.println(Arrays.deepToString(ans));

    }
}