package com.zili.oj;

import org.junit.Test;

import java.util.Arrays;

public class BASIC_1002_permutation_with_duplicated_itemsTest {

    @Test
    public void perm() {
        BASIC_1002_permutation_with_duplicated_items o = new BASIC_1002_permutation_with_duplicated_items();
        o.perm(new int[]{1, 2, 2}).forEach(a-> System.out.println(Arrays.toString(a)));
    }
}