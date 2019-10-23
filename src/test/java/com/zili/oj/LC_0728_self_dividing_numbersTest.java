package com.zili.oj;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class LC_0728_self_dividing_numbersTest {

    @Test
    public void selfDividingNumbers() {
        LC_0728_self_dividing_numbers o = new LC_0728_self_dividing_numbers();
//        assertTrue((new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22))).equals(new HashSet(o.selfDividingNumbers(1, 22))));
//        assertTrue((new HashSet(Arrays.asList(1, 2, 3, 4, 5))).equals(new HashSet(o.selfDividingNumbers(1, 5))));
        assertTrue((new HashSet(Arrays.asList())).equals(new HashSet(o.selfDividingNumbers(16, 17))));
        assertTrue((new HashSet(Arrays.asList(15))).equals(new HashSet(o.selfDividingNumbers(15, 15))));
    }
}